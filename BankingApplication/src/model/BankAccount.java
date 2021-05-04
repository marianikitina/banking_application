package model;

public class BankAccount {

	Client client = new Client();
	private int clientID = client.getClientID();
	
	private int acctNum;
	private double acctBalance;
	private String acctType;
	
	public BankAccount() {

	}
	
	public BankAccount(int clientID, int acctNum, double acctBalance, String acctType) {
		this.clientID = clientID;
		this.acctNum = acctNum;
		this.acctBalance = acctBalance;
		this.acctType = acctType;
	}
	
	public int getAcctNumber() {
		return acctNum;
	}
	public void setAcctNumber(int acctNum) {
		this.acctNum = acctNum;
	}
	
	public double getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
	
	public String getAcctType() {
		return acctType;
	}
	public void setAccType(String acctType) {
		this.acctType = acctType;
	}
	
	
}
