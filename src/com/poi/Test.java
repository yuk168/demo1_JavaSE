package com.poi;

import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.util.HashMap;  
import java.util.Map;  
   
   
public class Test {    
         
    public static void main(String[] args) throws Exception {    
             
        Map<String, Object> param = new HashMap<String, Object>();    
             
        Map<String,Object> header = new HashMap<String, Object>();    
        header.put("width",400);   
        header.put("height",150);   
        header.put("type","jpg");   
        header.put("content", WordUtil.inputStream2ByteArray(new FileInputStream("C:\\new.jpg"),true));  
        param.put("${img1}",header);   
           
           
        Map<String,Object> header2 = new HashMap<String, Object>();    
        header2.put("width",400);   
        header2.put("height",150);   
        header2.put("type","jpg");   
        header2.put("content", WordUtil.inputStream2ByteArray(new FileInputStream("C:\\new.jpg"),true));  
        param.put("${img2}",header2);   
           
             
        param.put("${table1}","1");  
        param.put("${table2}","2");  
        param.put("${table5}","5");  
        param.put("${table3}","3");  
        param.put("${param1}","oschina1");  
        param.put("${param53}","oschina53");  
           
           
        CustomXWPFDocument doc = WordUtil.generateWord(param, "C:\\Users\\Administrator\\Desktop\\docmodelreplaced333.docx");  
        //FileOutputStream fopts = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\docmodelreplaced2.docx");  
        FileOutputStream fopts = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\docmodelreplaced2.html");   
        doc.write(fopts);   
        fopts.close();   
    }   
}  