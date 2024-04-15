package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sb.beans.Registration;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext  context= SpringApplication.run(SpringbootApplication.class, args);
	
	Registration registration=context.getBean(Registration.class);
	System.out.println("Register :"+registration);
	}

}
