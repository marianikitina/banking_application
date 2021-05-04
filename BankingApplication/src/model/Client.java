package model;

import java.sql.Date;

public class Client extends User{

	private int clientID;
	private String clientAddress;
	private Date dateOfBirth;
	private int socialSecurityNum;
	private Date signUpDate;
	
	
	public int getClientID() {
		return clientID;
	}
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	
	public String getHomeAddress() {
		return clientAddress;
	}
	public void setHomeAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getSocialSecurityNum() {
		return socialSecurityNum;
	}
	public void setSocialSecurityNum(int socialSecurityNum) {
		this.socialSecurityNum = socialSecurityNum;
	}
	
	public Date getSignUpDate() {
		return signUpDate;
	}
	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}
	
	
}
