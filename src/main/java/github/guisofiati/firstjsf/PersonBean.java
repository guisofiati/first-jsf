package github.guisofiati.firstjsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "personBean")
public class PersonBean {
	
	private String name;
	private String lastName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}