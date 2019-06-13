package com.work.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.hwpf.extractor.WordExtractor;
import org.junit.Test;

/**
 * Java获取TXT文本和Word文件的内容并显示在页面
 * @author Administrator
 *
 */
public class demo8_WordFileShow {

	
	//txt
	@Test
	public void demo1() throws IOException {

		StringBuffer texts = new StringBuffer();

		String file = "E:/aa.txt";
		InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");// 加上编码转换
		BufferedReader read = new BufferedReader(isr);
		String line = null;
		while ((line = read.readLine()) != null) {
			texts.append(line);
		}
		System.err.println(texts);
		read.close();

	}
	
	@Test
	public void demo2(){
		try {  
			String file = "E:/aa.doc";
		    FileInputStream inputStream = new FileInputStream(file);  
		    WordExtractor extractor = new WordExtractor(inputStream);  
		    String text = extractor.getText();  
		    System.out.println(text);
		} catch (FileNotFoundException e) {  
		    e.printStackTrace();  
		} catch (Exception e) {  
		    e.printStackTrace();  
		} finally {
		}  
		
	}

}
