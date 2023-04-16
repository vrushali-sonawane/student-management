package autowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private int id;
	private String name;
	
	@Autowired  //field injection
	@Qualifier("address2")
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	//@Autowired //constructor injection
	public Student(Address address) {
		super();
		this.address=address;
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

	public Address getAddress() {
		return address;
	}
  //  @Autowired //setter injection
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter injection");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
