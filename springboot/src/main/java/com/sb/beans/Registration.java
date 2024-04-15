package com.sb.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "register")
@Component
public class Registration {
private String name;
private String fatherName;
private long mobileNo;
private String emailId;

}
