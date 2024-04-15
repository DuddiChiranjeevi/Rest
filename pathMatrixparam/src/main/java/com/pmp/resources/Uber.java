package com.pmp.resources;

import java.security.SecureRandom;
import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/uber")
public class Uber {
@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/{city}/{uberType}/{refNo}/search")
	
 public String bookUber(@PathParam("city") String city,@QueryParam("location") String location,@QueryParam("destination") String destination,@QueryParam("amount") double amount, @PathParam("refNo") String refNo,@PathParam("uberType") String uberType) {
		amount=new SecureRandom().nextDouble()*100;
		 refNo=UUID.randomUUID().toString().substring(0, 7);

		
	 return "{\"amount\":\""+amount+"\",\"Alocation\":\""+location+"\",\"Amount to be paid\":\""+destination+"\",\"refNo\":\""+refNo+"\",\nCompleted "
	 		+ "}";
		
	}
}
