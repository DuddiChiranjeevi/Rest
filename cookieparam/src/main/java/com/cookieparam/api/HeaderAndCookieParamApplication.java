package com.cookieparam.api;

import java.util.HashSet;
import java.util.Set;

import com.cookieparaam.beans.AmazoneBooking;

import jakarta.ws.rs.core.Application;

public class HeaderAndCookieParamApplication extends Application {
private Set<Class<?>> classes;

public HeaderAndCookieParamApplication(Set<Class<?>> classes) {
	classes=new HashSet<>();
	classes.add(AmazoneBooking.class);
}

@Override
public Set<Class<?>> getClasses() {
	return classes;
}

}
