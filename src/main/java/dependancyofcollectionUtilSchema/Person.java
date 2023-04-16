package dependancyofcollectionUtilSchema;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private String pname;
	private List<String> friends;
	private Map<String, Integer> coursefees;
	private Properties properties;
	
	
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Map<String, Integer> getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(Map<String, Integer> coursefees) {
		this.coursefees = coursefees;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", friends=" + friends + ", coursefees=" + coursefees + ", properties="
				+ properties + "]";
	}
	
	
	
	

}
