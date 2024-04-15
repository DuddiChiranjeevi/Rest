package com.formparameter.beans;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/register")
public class VoterRegistration {
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
 public String registerVoter( @FormParam("fullName") String fullName,@FormParam("username")String username,@FormParam("password")String password,@FormParam("mobileNo")long mobileNo,@FormParam("emailId")String emailId) {
			System.out.println("method called");
	System.out.println(username);
	return "FullName ="+fullName+","+"Username ="+username+","+"Password="+password+","+"Mobile No ="+mobileNo+","+"Email Id = "+emailId;
	 
 }
 }
