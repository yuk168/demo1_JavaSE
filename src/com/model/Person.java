package com.model;

public class Person {
	
	private String name;
	private int Age;
	
	public void hello(Student stu){
		String school = stu.getSchool();
		String sex = stu.getSex();
		System.out.println(school+""+sex);
	}
	
	public Person() {
	}
	public Person( int age,String name) {
		this.name = name;
		this.Age = age;
	}
	
	public Person(int aaa,int bbb) {  
		  
    }  
      
    public Person(double aaa,int bbb) {  
  
    }  
  
    public Person(String aaa,String bbb) {  
  
    } 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void sayChina(){
        System.out.println("hello ,china");
    }
    public void sayHello(String name, int age){
        System.out.println(name+"  "+age);
    }
	

}
