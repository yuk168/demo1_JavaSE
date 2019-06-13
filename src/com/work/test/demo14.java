package com.work.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class demo14 {
	
	
	public static void main(String[] args) {
		
		try {
			downloadFile("http://p3aqtqfml.bkt.clouddn.com/word/b.docx", "e:\\");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void downloadFile(String fileUrl,String fileLocal) throws Exception {
         URL url = new URL(fileUrl);
         HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
        urlCon.setConnectTimeout(6000);
        urlCon.setReadTimeout(6000);
	         int code = urlCon.getResponseCode();
        if (code != HttpURLConnection.HTTP_OK) {
             throw new Exception("文件读取失败");
         }
        
         //读文件流
         DataInputStream in = new DataInputStream(urlCon.getInputStream());
        DataOutputStream out = new DataOutputStream(new FileOutputStream(fileLocal));
         byte[] buffer = new byte[2048];
         int count = 0;
        while ((count = in.read(buffer)) > 0) {
            out.write(buffer, 0, count);
        }
        out.close();
        in.close();
    }

}
