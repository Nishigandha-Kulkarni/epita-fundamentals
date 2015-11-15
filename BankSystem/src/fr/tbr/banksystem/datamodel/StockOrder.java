package fr.tbr.banksystem.datamodel;

public class StockOrder {
	
	private int quantity;
	private double commission;
	
	private Stock stock;
	private InvestmentAccount account;
	
	
	/**
	 * @param quantity
	 * @param commission
	 * @param stock
	 * @param account
	 */
	public StockOrder(int quantity, double commission, Stock stock,
			InvestmentAccount account) {
		this.quantity = quantity;
		this.commission = commission;
		this.stock = stock;
		this.account = account;
	}


	@Override
	public String toString() {
		return "StockOrder [quantity=" + quantity + ", commission="
				+ commission + ", stock=" + stock + ", account=" + account
				+ "]";
	}
	
	
	
	

}
