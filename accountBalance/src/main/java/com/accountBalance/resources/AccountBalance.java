package com.accountBalance.resources;

import java.security.SecureRandom;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/accountBalance")
public class AccountBalance {
	@GET
	@Produces("text/plain")
public double getBalance(@QueryParam("mobileNo") String mobileNo) {
	System.out.println("Method called ");
	return new SecureRandom().nextDouble()*100;
}
	
}
	