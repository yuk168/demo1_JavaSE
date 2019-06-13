package com.test;

public class deom4 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
		sum += i;
		i++;
		} while (i <= 100);
		System.out.println("1到100累加的和为：" + sum);
	}
}
