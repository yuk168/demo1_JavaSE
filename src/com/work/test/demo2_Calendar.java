package com.work.test;

import java.util.Calendar;

import org.junit.Test;

public class demo2_Calendar {

	
	public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);
        
        //把Calendar.DAY_OF_MONTH，这个，也就是今天是这个月的第几天，设置为，今天是这个月第一天。
        cal.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("===================");
        System.out.println("当期时间: " + cal.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一年的第几天: " + doy);
    }
	
	
	@Test
	public void test1() throws Exception{
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);// 当前时间
		int mon = cal.get(Calendar.MONTH) + 1;
		String thismon= String.valueOf(y)+"-"+String.valueOf(mon);
		String string = JuheDemo.getRequest2(thismon);
		System.out.println(string);
		
	}
	
}
