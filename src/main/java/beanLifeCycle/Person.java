package beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("person class init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("person class destroy method");
	}

}
