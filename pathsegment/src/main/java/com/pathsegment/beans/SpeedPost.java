package com.pathsegment.beans;

import java.util.List;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.PathSegment;
@Path("/parcel")
public class SpeedPost {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{destinationAddress}/{parcelDetails}/search")
	
public String sendParcel(@PathParam("destinationAddress") PathSegment destinsationAddressPathSegmant, @PathParam("parcelDetails") PathSegment parcelDetailsPathSegmant, @QueryParam("maxWeight")@DefaultValue("10") double maxWeight, @QueryParam("shippingCharge") double shippingCharge,@QueryParam("timeDuration") @DefaultValue("2") int timeDuration) {
	String response=null;
	
 response="destinationAddress:"+destinsationAddressPathSegmant.getPath();
 MultivaluedMap<String, String> destinationAddressMatrixParam=destinsationAddressPathSegmant.getMatrixParameters();
		response+= ";"+extractMultivaluedMap(destinationAddressMatrixParam);
		
		response+="ParcelDetails:"+parcelDetailsPathSegmant.getPath();
		 MultivaluedMap<String, String> parcelDetailsMatrixParam=parcelDetailsPathSegmant.getMatrixParameters();

		response+=";"+extractMultivaluedMap(parcelDetailsMatrixParam);
		response+="Max Weight="+maxWeight+","+"Shipping charge per killometer="+shippingCharge+","+"Parcel Deliver time="+timeDuration;
		System.out.println(response);
		return response;
}
	
	private String extractMultivaluedMap(MultivaluedMap<String , String> multivaluedMap) {
		String content=" ";
		for(String key: multivaluedMap.keySet()) {
			List<String> values=multivaluedMap.get(key);
			
			content+=key+"=[";
			for(String value: values) {
				content+=value+" ";
				
			}
			content+="];";
			System.out.println(content);
		}
		return content ;
		
	}
}
