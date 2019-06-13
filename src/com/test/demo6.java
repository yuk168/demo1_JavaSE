package com.test;

import org.junit.Test;

public class demo6 {

	@Test
	public void test1(){
		int i;
		String s1="123";
		i = Integer.parseInt(s1);
		System.out.println(i);
		
	}
	
	@Test
	public void test2(){
		String s1;
		int i=123;
		s1 = Integer.toString(i);
		System.out.println(s1);
		
	}
}
