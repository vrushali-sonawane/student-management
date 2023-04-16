package beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle/beans.xml");
		
		context.registerShutdownHook();
		
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
	}

}
