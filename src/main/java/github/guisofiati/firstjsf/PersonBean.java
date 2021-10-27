package github.guisofiati.firstjsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean(name = "personBean")
public class PersonBean {
	
	private HtmlCommandButton commandButton;
	private String name;
	
	private List<String> names = new ArrayList<String>();
	
	public String addName() {
		names.add(name);
		if (names.size() == 3) {
			commandButton.setDisabled(true);
			return "navigationpage";
		}
		return "";
	}
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
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