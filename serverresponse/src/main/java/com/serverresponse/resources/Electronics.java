package com.serverresponse.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pendrive")
public class Electronics {
@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/{productModel}/search")
	public double getPrice(@PathParam("productModel")  String productModel, @MatrixParam("weight") String weight) {
		return 30000;
	}
}
