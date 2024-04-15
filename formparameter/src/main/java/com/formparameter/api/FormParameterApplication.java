package com.formparameter.api;

import java.util.HashSet;
import java.util.Set;

import com.formparameter.beans.VoterRegistration;

import jakarta.ws.rs.core.Application;

public class FormParameterApplication  extends Application{
	private Set<Class<?>> classes;

	public FormParameterApplication(Set<Class<?>> classes) {
		classes=new HashSet<>();
		classes.add(VoterRegistration.class);
		
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	
	
	
	
}
	
	
	
	


