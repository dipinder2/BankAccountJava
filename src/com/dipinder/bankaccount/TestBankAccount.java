package com.dipinder.bankaccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		BankAccount myAccount1 = new BankAccount();
		myAccount.deposit(100.00);
		myAccount.deposit(0.00,100.00);
		myAccount.deposit(0.00,1100.00);
		myAccount.withdraw(0,20.00);
		System.out.print(myAccount.showBalances());
		System.out.println(BankAccount.numOfAccounts);
		System.out.println(BankAccount.bankBalance);
	}

}
