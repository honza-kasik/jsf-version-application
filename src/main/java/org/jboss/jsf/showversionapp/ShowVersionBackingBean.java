package org.jboss.jsf.showversionapp;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloWorld", eager = true)
public class ShowVersionBackingBean {
	
	private String jsfVersion;

	public ShowVersionBackingBean() {
		this.jsfVersion = FacesContext.class.getPackage().getImplementationVersion();
	}

	public String getJsfVersion() {
		return jsfVersion;
	}
	
}
