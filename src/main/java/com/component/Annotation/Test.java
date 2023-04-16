package com.component.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/component/Annotation/beans.xml");
		
		Student student = context.getBean("stu",Student.class);
		//System.out.println(student);
		
//		System.out.println(student.getAddress().getClass().getName());
//		System.out.println(student.getCourse().getClass().getName());
		
		System.out.println(context.isSingleton("stu"));
		System.out.println(context.isPrototype("stu"));
		System.out.println(student.hashCode());
		
		Student student2 = context.getBean("stu",Student.class);
		System.out.println(student2.hashCode());
		System.out.println(context.isPrototype("stu"));
		
		
	}

}
