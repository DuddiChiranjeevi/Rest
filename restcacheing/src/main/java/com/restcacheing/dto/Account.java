package com.restcacheing.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class Account {
 private long accountNo;
 private String accountHolderName;
 private String fatherName;
 private String ifscCode;
 private String branch;
 private String mobileNo;
 private String emailAddress;
 private double Balance;

}
 
 


