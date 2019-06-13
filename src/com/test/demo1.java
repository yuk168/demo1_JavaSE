package com.test;

public class demo1 {
	
	int a;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("运行类的finalize方法");
	}

	
	public static void main(String[] args) {
		demo1 dm= new demo1();

		dm=null;
		System.gc();
	}
}
