package com.regexpattern.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.PathSegment;

@Path("/plan")
public class RechargePlan {
@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/{mobileNo}/{refNo: [^abc]{3}[0-9]{7}}/recharge")
	public String getPlan(@PathParam("mobileNo") PathSegment mobileNoSegment,@PathParam("refNo") String refNo) {
		return "{\"mobileNo\":"+mobileNoSegment+",\"refno\":"+refNo+"}";
		
	}
		
	}

