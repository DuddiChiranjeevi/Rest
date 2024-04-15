package com.clientapplication.service;

import java.util.List;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

public class StudentMatrixServiceApi {
private Client client; 
private  final String BASE_REQUEST_URl="/serverapplication/api/student";
private final String HOSTNAME="localhost";
private final int PORT=8080;

public StudentMatrixServiceApi() {
	ClientBuilder clientBuilder=ClientBuilder.newBuilder();
	client=clientBuilder.build();
}


	public String studentDetails(String studentName,String mobileNo, String operatorType,String course,List<Integer> courseDuration,double minFee,double maxFee) {
		String body =null;
		WebTarget target=client.target("http://"+HOSTNAME+":"+PORT+BASE_REQUEST_URl).path("/{studentName}/{mobileNo}").matrixParam("operatorType", operatorType).path("/{course}");
		for(Integer duration:courseDuration) {
			
			target=target.matrixParam("courseDuration", duration);
			//System.out.println("Course Duration "+target);
		}
				
		target =target.resolveTemplate("studentName", studentName).resolveTemplate("mobileNo", mobileNo).resolveTemplate("course", course).queryParam("minFee",minFee).queryParam("maxFee", maxFee).path("/register");
		System.out.println("Targeted value :"+target);
		Invocation.Builder builder=target.request();
		Invocation invocation=builder.buildGet();
		Response response=invocation.invoke();
		if(response.getStatus() == Status.OK.getStatusCode()) {
			 body=response.readEntity(String.class) ;
		}else {
			System.out.println("Error mrssage: "+response.getStatus());
		}
		return body;
	
	}
}
