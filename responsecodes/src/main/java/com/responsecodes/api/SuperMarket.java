package com.responsecodes.api;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/csr")
public class SuperMarket {
	double refNo;
@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/{customerId}/{customerName}/search")
	public String getBookingDetails(  @PathParam("customerId") String customerId, @PathParam("customerName") String customerName) {
	
   refNo=Math.random()*10;

		return "{\"customerId\":\""+customerId+"\",\"Customer Name\":\""+customerName+"\",\"rice\":\"25 kg\",\"coconut oil\":\"1 liter\",\"sunflowweroil\":\"1 liter\",\"Red gra\":\"2 kg\",\"onions\":\"1 kg\",\"refNo\":"+refNo+"}";
	} 
@GET
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
@Path("/{refNo}/price")
public Response  getAmount( @PathParam("refNo") Double refNo) {
	String author="chiranjeevi";
	String value=SuperMarket.this.getBookingDetails("c0001", "chiranjeevi");

		return Response.ok().status(200).header("Author name", author).header("cache value ",value).build();	
	
}
}
