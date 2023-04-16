package autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire/Annotation/beans.xml");
	
	Student stu1 = context.getBean("stu",Student.class);
	System.out.println(stu1);
	}

	
}
