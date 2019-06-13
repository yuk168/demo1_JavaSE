package com.work.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class demo3_List {

	
	//list的长度是可变的
	@Test
	public void test1(){
		String str="2018-10-12-11111111111";
		int indexOf = str.lastIndexOf("-");
		String substring = str.substring(indexOf+1,str.length());
		List<String> workdaylist = new ArrayList<String>();
		for(int i=0;i<str.length();i++){
			workdaylist.add(str);
		}
		System.out.println(substring);
	}
	
	@Test
	public void test2(){
		
		int a=1;
		int b=2;
		int c=3;
		if((a==1 && c==3) || (b==1 && c==3)){
			System.out.println("hello!!!!!!");
		}
	}
	
	@Test
	public void test3(){
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> list1= new ArrayList<String>();
		List<String> list2= new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list2.add("c");
		list2.add("d");
		list.add(list1);
		list.add(list2);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}

