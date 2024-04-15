package com.cookieparaam.beans;

import java.util.List;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.PathSegment;

@Path("/book")
public class AmazoneBooking {
@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/{manufacturer}/{feature}/search")
	public String bookMobile(@PathParam("manufacturer") PathSegment manufacturerPathSegment,@PathParam("feature") PathSegment featurePathsegment,@QueryParam("maxPrice") @DefaultValue("30000") double maxPrice, @QueryParam("minPrice") double minPrice,@CookieParam("userName") String userName ,@CookieParam("password") String password,@HeaderParam("refNo") String refNo) {
	String response=null;
	response="manufacturer :"+manufacturerPathSegment.getPath();
	MultivaluedMap<String , String> multivaluedMapManufacturer=manufacturerPathSegment.getMatrixParameters();
	response+=";"+extractMultivaluedMap(multivaluedMapManufacturer);
	response+="feature :"+featurePathsegment.getPath();
	
	MultivaluedMap<String , String> multivaluedMapFeature= featurePathsegment.getMatrixParameters();
	response+=";"+extractMultivaluedMap(multivaluedMapFeature);
	response+="MaxMium Price ="+maxPrice+","+"Minimum Price="+minPrice+","+"UserName="+userName+","+"password="+password+","+"refNo ="+refNo;
	System.out.println(response);
	return response;
	
	}

private String extractMultivaluedMap(MultivaluedMap<String , String> multivaluedMap) {
	String content=" ";
	for(String key:multivaluedMap.keySet()) {
		List<String> values=multivaluedMap.get(key);
		
		content+=key+"=[";
		
		for(String value: values) {
			content+=value+" ";
		}
		content+="],";
		
	}
	return content;
}
}
