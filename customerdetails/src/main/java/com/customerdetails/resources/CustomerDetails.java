package com.customerdetails.resources;

import java.util.Random;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/customer/")
public class CustomerDetails {
	@GET
	@Produces("text/plain")
	@Path("{mobileNo}/{name}")
 public double getDetails(@PathParam("mobileNo")  String mobileNo,@PathParam("name") String name) {
		System.out.println("method called");
	return new Random().nextDouble()*1000;
	 
 }
}
