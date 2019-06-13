package com.test;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Calendar;

import org.junit.Test;

public class demo5 {

	@Test
	public void test1() {
		Integer i = new Integer(10);
		int k = i.intValue();
		System.out.println(k);
	}
	
	@Test
	public void test2(){
		int i=10;
		Integer it = new Integer(i);
		System.out.println(it);
		
	}
	
	@Test
	public void test3(){
		String str="10";
		//Integer it = new Integer(str);
		int it= new Integer(str);
		System.out.println(it);
		
	}
	
	@Test
	public void test4(){
		int i=10;
		//String s= String.valueOf(i);
		//String s= Integer.toString(i);
		String s =""+i;
		System.out.println(s);
	}

	@Test
	public void test5(){
		String str="10";
		Integer it = Integer.valueOf(str);
		System.out.println(it);
	}
	
	@Test
	public void test6(){
		Integer it = new Integer(10);
		String str= it.toString();
		System.out.println(str);
		
	}
	
	@Test
	public void test7(){
		String str="10";
		BigDecimal bd= new BigDecimal(str);
		System.out.println(bd);
		
	}
	
	@Test
	public void test8(){
		Calendar calendar = Calendar.getInstance();
		int year= calendar.get(Calendar.YEAR);
		int mouth= calendar.get(Calendar.MONTH);
		int day= calendar.get(Calendar.DATE);
		
		System.out.println(year+"-"+mouth+"-"+day);
		
		//获取今天的日期字符串
		String today = java.text.DateFormat.getDateInstance().format(new java.util.Date());
		//获取今天的日期
		Date date = new java.sql.Date(System.currentTimeMillis());
		System.out.println(today);
		System.out.println(date);
		
		
	}
}
