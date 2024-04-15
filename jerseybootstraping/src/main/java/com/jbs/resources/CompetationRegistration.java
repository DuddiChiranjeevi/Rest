package com.jbs.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/registration")
public class CompetationRegistration {
@GET
@Produces(MediaType.TEXT_PLAIN)

public String getRegistrationDetails(@QueryParam ("mobileNo") String mobileNo ) {
	System.out.println("Bootstraping");
		return "mobileNo";
		
	}
}
