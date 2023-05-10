package com.basicrest.dto;

public class CustomerInfo {
	
	private int customerNo;
	private String customerName;
	private String emailAddress;
	private String country;
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "CustomerInfo [customerNo=" + customerNo + ", customerName=" + customerName + ", emailAddress="
				+ emailAddress + ", country=" + country + "]";
	}
	
	

}
