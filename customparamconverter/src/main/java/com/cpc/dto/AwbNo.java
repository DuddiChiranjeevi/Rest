package com.cpc.dto;

public class AwbNo {
	
	private String cityCode;
	private String branchCode;
	private String destinationBranchCode;
	private int bookedDate;
	private int serialNo;
	
	@Override
	public String toString() {
		return "AwbNo [cityCode=" + cityCode + ", branchCode=" + branchCode + ", destinationBranchCode="
				+ destinationBranchCode + ", bookedDate=" + bookedDate + ", serialNo=" + serialNo + "]";
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getDestinationBranchCode() {
		return destinationBranchCode;
	}
	public void setDestinationBranchCode(String destinationBranchCode) {
		this.destinationBranchCode = destinationBranchCode;
	}
	public int getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(int bookedDate) {
		this.bookedDate = bookedDate;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

}
