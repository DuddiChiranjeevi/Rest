package com.restcacheing.boot;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.restcacheing.api.AccountApiService;

import jakarta.ws.rs.ApplicationPath;
@ApplicationPath("/api")
public class RestfulCacheApplication extends ResourceConfig {

	public RestfulCacheApplication() {
		register(JacksonFeature.class);
		register(AccountApiService.class);
	}



}
