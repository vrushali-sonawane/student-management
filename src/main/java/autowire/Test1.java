package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire/beans.xml");
	
	Employee emp1 = context.getBean("emp1",Employee.class);
	System.out.println(emp1);
	}
}
