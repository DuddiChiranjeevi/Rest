package com.automatictypeconversion.beans;

import java.util.List;
import java.util.stream.Collectors;

import com.automatictypeconversion.dto.TrackingNo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/product")
public class Product {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{productcode}/price")
	public double getPrice(@PathParam("productcode") int productcode) {
		
		return productcode;
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/search")
	public String search( @QueryParam("catageories")List<Integer> catageories) {
		String cats=catageories.stream().map(c->String.valueOf(c)).collect(Collectors.joining(","));
		return cats;
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{trackingNo}/track")
	
	public String track(@PathParam("trackingNo") TrackingNo trackingNo) {
		return trackingNo.toString();	}
}
