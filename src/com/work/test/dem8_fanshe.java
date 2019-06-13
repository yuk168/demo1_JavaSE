package com.work.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.model.Person;
import com.model.Student;

public class dem8_fanshe {
	
	
	//通过Java反射机制,用Class 创建类对象
	@Test
	public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class<?> class1 =null;
		class1 = Class.forName("com.model.Person");
		Person person = (Person) class1.newInstance();
		person.setAge(30);
		person.setName("zhangsan");
		System.out.println(person.getName()+"--"+person.getAge());
	}
	
	//通过Java反射机制,得到类的包名和类名 
	@Test
	public void test2(){
		Person person = new Person(); 
		System.out.println(person.getClass().getPackage().getName()+"---"+person.getClass().getName());
	}
	
	//验证所有的类都是Class类的实例对象 
	@Test
	public void test3() throws ClassNotFoundException{
		//定义两个类型都未知的Class , 设置初值为null, 看看如何给它们赋值成Person类  
		Class<?> class1 = null;  
     	Class<?> class2 = null;  
     	//方式1
     	class1 = Class.forName("com.model.Person");
     	System.out.println(class1.getPackage().getName()+"--"+class1.getName());
     	//方式2
     	class2= Person.class;
     	System.out.println(class2.getPackage().getName()+"--"+class2.getName());
	}
	
	//通过Java反射机制得到一个类的构造函数，并实现创建带参实例对象  
	@Test
	public void test4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Class<?> class1 = null;  
        Person person1 = null;  
        Person person2 = null; 
        
        class1 = Class.forName("com.model.Person");
        Constructor<?>[] constructors = class1.getConstructors();
        for(int i=0;i<constructors.length;i++){  
            System.out.println("i= "+i+"  "+constructors[i].toGenericString());  
        } 
        person2 = (Person) constructors[3].newInstance(20,"leeFeng");    
        
        person1 = (Person) constructors[4].newInstance();    
        person1.setAge(30);    
        person1.setName("leeFeng");    
            
        System.out.println("Demo4: " + person1.getName() + " : " + person1.getAge()    
                + "  ,   " + person2.getName() + " : " + person2.getAge()); 
        
        
        
	}
	
	
	@Test
	public void test5(){
		Class<?> c = Person.class;
		try {
			//调用Person类中的sayHello方法
			Method method = c.getMethod("sayHello", String.class,int.class);
			Object invoke = method.invoke(c.newInstance(), "小明",20);
			System.out.println(invoke);
			
			//调用Person类中的hello方法，传递的参数是对象
			Method m = c.getMethod("hello", Student.class);
			Student stu = new Student();
			stu.setSchool("北大");
			stu.setSex("男");
			Object invoke2 = m.invoke(c.newInstance(),stu);
			System.out.println(invoke2);
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
