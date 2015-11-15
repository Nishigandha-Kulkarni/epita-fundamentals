package fr.tbr.banksystem.datamodel;

public class SavingsAccount extends Account {

	private double interestRate;

	/**
	 * @param interestRate
	 */
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", balance=" + this.getBalance() +"]";
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		if (interestRate < 0){
			//we can refuse to set the value
			return;
		}
		this.interestRate = interestRate;
	}

	
	
	

	
	
	
	
	
}
