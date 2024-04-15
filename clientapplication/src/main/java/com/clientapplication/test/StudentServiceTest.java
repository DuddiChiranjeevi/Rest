package com.clientapplication.test;

import java.util.Arrays;

import com.clientapplication.service.StudentMatrixServiceApi;

public class StudentServiceTest {
public static void main(String[] args) {
//	double fee=new StudentClientService().getFee("9059798193");
//	System.out.println("Feese to be paid  :"+fee);
//	
	String details=new StudentMatrixServiceApi().studentDetails("Chiranjeevi", "9059798193", "Airtel","Java", Arrays.asList(new Integer[] {100,200,300}), 2000, 4000);
System.out.println(details);
}
}
