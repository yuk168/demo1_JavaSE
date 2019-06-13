package com.work.test;

import java.math.BigDecimal;

import org.junit.Test;

public class demo4_IntToDecimal {
	//这种方法返回的是一个字符串，所以不是很好
	@Test
	public void test1(){
		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");  
		String format = df.format(10);
		System.out.println(format);
	}
	
	
	@Test
	public void test2(){
		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
		
		String format = df.format(3.4445);
		System.out.println(format);
	}
	
	
	@Test
	public void test3(){
		double   f   =   111231.5585;  
		BigDecimal   b   =   new   BigDecimal(f);  
		double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
		System.out.println(f1);
	}
	
	
	@Test
	public void test4(){
		double   f   =   10;
		BigDecimal   b   =   new   BigDecimal(f);  
		double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
		System.out.println(f1);
	}
	
	@Test
	public void test5(){
		double d=10;
		System.out.printf("%.2f",d);
		double d2 = 3.1415926;
		String result = String .format("%.2f");
	}
	
	@Test
	public void test6(){
		double c=10;
		c = (double)(Math.round(c*100)/100.0);
		System.out.println(c);
	}

}
