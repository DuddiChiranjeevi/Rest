package com.clientapplication.service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

public class StudentClientService {
	public double getFee(String mobileNo) {
double fee=0.0;
	Client client=null;
	ClientBuilder clientBuilder=null;
	WebTarget target=null;
	Invocation.Builder invocationBuilder=null;
	Invocation invocation=null;
	Response response=null;
	
	clientBuilder =ClientBuilder.newBuilder();
	client=clientBuilder.build();
	target=client.target("http://localhost:8080/serverapplication/api/student/fee");
	target.queryParam("mobileNo", mobileNo);
	invocationBuilder=target.request();
	invocation=invocationBuilder.buildGet();
	response =invocation.invoke();
	if(response.getStatus() == Status.OK.getStatusCode()) {
	fee=response.readEntity(Double.class);
	}
	return fee;
	
	}
}
