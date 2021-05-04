package model;

import java.sql.Timestamp;

public class Transaction{
	
	BankAccount acct = new BankAccount();
	private int acctNum = acct.getAcctNumber();
	
	private int transactionID;
	private Timestamp transactionTimestamp;
	private String description;
	private double startBalance;
	private double endBalance;
	
	
	public Transaction(int acctNum, int transactionID, Timestamp transactionTimestamp, String description, double startBalance, double endBalance) {
		this.acctNum = acctNum;
		this.transactionID = transactionID;
		this.transactionTimestamp = transactionTimestamp;
		this.description = description;
		this.startBalance = startBalance;
		this.endBalance = endBalance;
	}
	
	
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	
	public Timestamp getTransactionTimestamp() {
		return transactionTimestamp;
	}
	public void setTransactionTimestamp(Timestamp transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getStartBalance() {
		return startBalance;
	}
	public void setStartBalance(double startBalance) {
		this.startBalance = startBalance;
	}
	
	public double getEndBalance() {
		return endBalance;
	}
	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}
	
}
