package com.dipinder.bankaccount;

public class BankAccount {
	
	private double checkingBalance;
	private double savingBalance;
	public static int numOfAccounts;
	public static double bankBalance;
	
	public BankAccount(){
		numOfAccounts++;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public void deposit(double amount) {
		checkingBalance += amount;
		bankBalance += amount;
	}
	
	public void deposit(double amount,double amount1) {	
		savingBalance += amount1;
		bankBalance +=amount1;
	}
	public void withdraw(double amount) {
		checkingBalance -= amount;
		bankBalance -= amount;
	}
	
	public void withdraw(double amount,double amount1) {	
		savingBalance -= amount1;
		bankBalance -=amount1;
	}
	
	public String showBalances() {
		return ("Checking Balance is " +
				getCheckingBalance() + 
				"\nSaving Balance is " + 
				getSavingBalance()+
				"\n");
	}
	
}
