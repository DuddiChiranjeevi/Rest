package com.automatictypeconversion.dto;

public class TrackingNo {
private String sourceBranch;
private String destinationBranch;
private int serialNo;
@Override
public String toString() {
	return "TrackingNo [sourceBranch=" + sourceBranch + ", destinationBranch=" + destinationBranch + ", serialNo="
			+ serialNo + "]";
}
public String getSourceBranch() {
	return sourceBranch;
}
public void setSourceBranch(String sourceBranch) {
	this.sourceBranch = sourceBranch;
}
public String getDestinationBranch() {
	return destinationBranch;
}
public void setDestinationBranch(String destinationBranch) {
	this.destinationBranch = destinationBranch;
}
public int getSerialNo() {
	return serialNo;
}
public void setSerialNo(int serialNo) {
this.serialNo = serialNo;
	
	
}
/*
 * public TrackingNo(String trackingNo) { sourceBranch=trackingNo.substring(0,
 * 3); destinationBranch=trackingNo.substring(3, 6);
 * serialNo=Integer.parseInt(trackingNo.substring(6, 11)); }
 */

public static TrackingNo valueOf(String trackingNo) {
	TrackingNo trackingNo2=new TrackingNo();
	trackingNo2.setSourceBranch(trackingNo.substring(0, 2));
	trackingNo2.setDestinationBranch(trackingNo.substring(2, 5));
	trackingNo2.setSerialNo(Integer.parseInt(trackingNo.substring(5, 10)));
	return trackingNo2;
}
}
