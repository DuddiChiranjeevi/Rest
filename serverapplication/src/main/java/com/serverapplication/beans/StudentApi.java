package com.serverapplication.beans;

import java.util.List;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
@Path("student")
public class StudentApi {

//	@Path("/fee")
//	@Produces(MediaType.TEXT_PLAIN)
//	@GET
//	public double getFee( @QueryParam("mobileNo") String mobileNo) {
//		return new SecureRandom().nextDouble()*100;
//	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{studentName}/{mobileNo}/{course}/register")
	public String studentDetails(@PathParam("studentName") String studentName,@PathParam("mobileNo") String mobileNo,@MatrixParam("operatorType") String operatorType,@PathParam("course") String course,@QueryParam("minFee") @DefaultValue("1000")double  minFee,@QueryParam("maxFee") @DefaultValue("13000") double maxFee,@MatrixParam("courseDuration") List<Integer> courseDuration) {
		
		
		return "Student Name: "+studentName+"  Mobile Number : "+mobileNo+"  OperatorType ::"+operatorType+"  Courses Offered :"+course+"  Duration of course in months :"+courseDuration+"  Min Fee : "+minFee+"  Max Fee"+maxFee;
	}
}
