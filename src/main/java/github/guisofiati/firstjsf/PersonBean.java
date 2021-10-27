package github.guisofiati.firstjsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name = "personBean")
public class PersonBean {
	
	private String name;
	
	private List<String> names = new ArrayList<String>();
	
	public String addName() {
		names.add(name);
		return "";
	}
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}