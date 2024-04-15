package com.pathquerryparm.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/book")
public class ClickAndBook {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@PathParam("{productName}/{productType}/search")
	
public String  getBookingDetails(@PathParam("productName") String productName, @PathParam("productType") String productType,@MatrixParam("color") String color ,@MatrixParam("price")double price ,@QueryParam("mobileNo") String mobileNo,@QueryParam("refNo") String refNo  ){
	return "{productName: "+productName+",productType : "+productType+",color :"+color+",price :"+price+",mobileNo: "+mobileNo+" ,refNo"
			+ "}";
	
}
}
