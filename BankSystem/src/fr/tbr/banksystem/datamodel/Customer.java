package fr.tbr.banksystem.datamodel;

import java.util.List;

public class Customer {
	
	//Fields definition
	private String name;
	private String address;
	
	//This is not accurate enough
	//private List<Account> accountsList;

	private InvestmentAccount investAccount;
	private SavingsAccount savingsAccount;
	
	/**
	 * @param name the name of the customer
	 * @param address his address, according to the ... specification
	 * @param accountsList a list of account that has to be initialized
	 */
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
		
	}
	
	/**
	 * Use this constructor if you want to directly initialize the customer with
	 * his accounts
	 * otherwise, use {@link #Customer(String, String)}
	 * @param name
	 * @param address
	 * @param investAccount
	 * @param savingsAccount
	 */
	public Customer(String name, String address, InvestmentAccount investAccount, SavingsAccount savingsAccount){
		this.name = name;
		this.address = address;
		this.investAccount = investAccount;
		this.savingsAccount = savingsAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public InvestmentAccount getInvestAccount() {
		return investAccount;
	}

	public void setInvestAccount(InvestmentAccount investAccount) {
		this.investAccount = investAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address
				+ ", investAccount=" + investAccount + ", savingsAccount="
				+ savingsAccount + "]";
	}
	
	
	

}
