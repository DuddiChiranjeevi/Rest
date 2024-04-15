package com.restcacheing.api;

import java.security.SecureRandom;

import com.restcacheing.dto.Account;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.CacheControl;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("account")
public class AccountApiService {
/**
 * @param accountNo
 * @return
 */
@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("/{accountNo}/details")
	public Response getAccount( @PathParam("accountNo") long accountNo) {
	
		Response response=null;
		CacheControl cacheControl=null;
		/*
		 * Account account=new Account(); account.setAccountNo(accountNo);
		 * System.out.println("accountNo:  "+accountNo);
		 * account.setAccountHolderName("Chiru"); account.setFatherName("Subramanyam");
		 * account.setIfscCode("UBIN1054652K"); account.setBranch("Karvatinagaram");
		 * account.setMobileNo("9059798193"); account.setEmailAddress("chiru@123");
		 * account.setBalance(new SecureRandom().nextDouble(100*100));
		 */
		
		
		Account account =Account.of().accountNo(accountNo).accountHolderName("Chiranjeevi").fatherName("Subramanyam").branch("KarvatiNagaram").mobileNo("111111").emailAddress("2345@112").Balance(new SecureRandom().nextDouble(50*2)).build();
				System.out.println(account);
				
		cacheControl =new CacheControl();
		cacheControl.setMaxAge(30);
	cacheControl.setMustRevalidate(true);
		response=Response.ok(account).cacheControl(cacheControl).build();
		System.out.println(response);
		
	
		return response;
		
		
	}
}
