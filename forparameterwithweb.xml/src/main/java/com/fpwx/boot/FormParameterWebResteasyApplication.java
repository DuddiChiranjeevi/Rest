package com.fpwx.boot;

import java.util.HashSet;
import java.util.Set;

import com.fpwx.beans.NetBanking;

import jakarta.ws.rs.core.Application;

public class FormParameterWebResteasyApplication extends Application {
	
	private Set<Class<?>> classes;

	public FormParameterWebResteasyApplication(Set<Class<?>> classes) {
		classes=new HashSet<>();
		classes.add(NetBanking.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	 

}
