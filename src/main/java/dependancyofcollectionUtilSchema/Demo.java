package dependancyofcollectionUtilSchema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("dependancyofcollectionUtilSchema/beans.xml");
		
		Person person1 = context.getBean("person1",Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		
		Person person2 = context.getBean("person2",Person.class);
		System.out.println(person2);
		
		System.out.println("*************************************");
		
		System.out.println(person1.getCoursefees());
		System.out.println(person1.getCoursefees().getClass().getName());
		
	}
}
