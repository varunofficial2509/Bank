package com.sopra.project;

public class Bank {
	private int bankID;
	private String bankName;
	private String accNumber;
	public int getBankID() {
		return bankID;
	}
	public void setBankID(int bankID) {
		this.bankID = bankID;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public Bank(int bankID, String bankName, String accNumber) {
		super();
		this.bankID = bankID;
		this.bankName = bankName;
		this.accNumber = accNumber;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bank [bankID=" + bankID + ", bankName=" + bankName + ", accNumber=" + accNumber + "]";
	}
	
}
