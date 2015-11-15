package fr.tbr.banksystem.datamodel;

public class Stock {
	
	private String name;
	private double unitPrice;
	private double ticker;
	/**
	 * @param name
	 * @param unitPrice
	 * @param ticker
	 */
	public Stock(String name, double unitPrice, double ticker) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.ticker = ticker;
	}
	
	

}
