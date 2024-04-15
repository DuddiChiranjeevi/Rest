package com.paqp.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/parcel")
public class Parcel {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{refNo}/search")
 public String getDetails(@PathParam("refNo") String refNo) {
		System.out.println("Get Details");
	 return refNo;
 }
}