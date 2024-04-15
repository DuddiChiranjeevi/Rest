package com.matrixparam.resources;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/book")
public class Urotaxi {
 @GET
 @Produces(MediaType.APPLICATION_JSON)
 @Path("/{pickup}/{destination}/search")
	public String  bookTaxi(@PathParam("pickup") String pickup,@PathParam("destination") String destination,@QueryParam("mobileNo") @DefaultValue("9059798193") String mobileNo) {
		
		
		
		return "{\"pickup\":\""+pickup+"\",\"Destination\":\""+destination+"\",\"mobileNo\":\""+mobileNo+"\"}" ;
		
	}
}
