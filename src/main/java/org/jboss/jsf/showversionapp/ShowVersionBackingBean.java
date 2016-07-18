package org.jboss.jsf.showversionapp;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloWorld", eager = true)
public class ShowVersionBackingBean {

	public ShowVersionBackingBean() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
		return "Hello World!";
	}
	
	public String getVersion() {
		return FacesContext.class.getPackage().getImplementationVersion();
	}

}
