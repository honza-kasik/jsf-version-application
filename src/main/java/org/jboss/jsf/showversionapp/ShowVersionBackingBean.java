package org.jboss.jsf.showversionapp;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "helloWorld", eager = true)
public class ShowVersionBackingBean {
	
	private String jsfVersion;

	public ShowVersionBackingBean() {
		Package pckg = FacesContext.class.getPackage();
		
		if (Package.getPackage("com.sun.faces") != null) {
			pckg = Package.getPackage("com.sun.faces");
		}
		
		this.jsfVersion =
				pckg.getImplementationTitle() + "__" +
				pckg.getImplementationVersion();
		}

	public String getJsfVersion() {
		return jsfVersion;
	}
	
}
