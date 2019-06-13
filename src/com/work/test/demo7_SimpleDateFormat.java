package com.work.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class demo7_SimpleDateFormat {
	
	@Test
	public void test1(){
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = dateformat.format(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		System.out.println(dateStr);
	}
	
	@Test
	public void test2(){
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		    long time = 0;
			try {
				time = dateformat.parse("2016-09-02").getTime();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(time);
		}
}
