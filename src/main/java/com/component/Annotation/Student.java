package com.component.Annotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
//@Scope("singleton")
@Scope("prototype")
public class Student {
	@Value("101")
	private int id;
	@Value("Sanket")
	private String name;
	@Value("Nashik")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;
	
	@Value("#{course}")
	private Map<String,String> course;
	
	
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + ", course=" + course
				+ "]";
	}
	
	
	
	

}
