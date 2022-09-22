package com.sopra.project;

import java.util.Scanner;

class Account {
	Scanner sc = new Scanner(System.in);
	public String name;
	public static int AccNumCnt = 0;
	public int AccID = 2000;
	public double balance; 
	private int Varun = 1001;
	private int Nit = 1002;
	private int PC = 1003;
	
	public void depositMoney(int i) {
		if(i == Varun)
		{
			double depAmt = 0;
			System.out.println("Enter amount that you want to deposit: ");
			depAmt = sc.nextDouble();
			balance = balance + depAmt;
			System.out.println("Your new balance is: " + balance);
		}
		else
		{
			System.out.println("Records not found !!");
		}
		
	}
	
	
	public void withdrawMoney() {
		double witAmt = 0;
		do {
			System.out.println("Enter amount that you want to withdraw: ");
			witAmt = sc.nextDouble();
			
			if (witAmt > balance) {
				System.out.println("Account balance is less! Cannot withdraw...transaction failed!");
			}
		} while (witAmt > balance);
		balance = balance - witAmt;
		System.out.println("Your current balance is: " + balance);
	}
	

	public void checkBal() {
		System.out.println("Your current balance is: " + balance);
	}
	
	
}


public class Main1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Account obj = new Account();
				
		obj.depositMoney(1002);
		obj.withdrawMoney();
		obj.checkBal();
				
		}	
}
