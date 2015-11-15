/**
 * 
 */
package fr.tbr.banksystem.launchers;

import java.util.Scanner;

import fr.tbr.banksystem.datamodel.Customer;
import fr.tbr.banksystem.datamodel.InvestmentAccount;
import fr.tbr.banksystem.datamodel.SavingsAccount;

/**
 * This is the main class to launch the application
 * to launch the program, use 
 * <pre><code>java fr.tbr.banksystem.launchers.Main</code></pre>
 * in a command line.
 * 
 * this will trigger the {@link #main(String[])} method.
 * Available arguments are defined as the following:
 * 
 * <ul>
 * <li><code>arg1</code> : main conf file location </li>
 * <li>...</li>
 * </ul>
 * 
 * 
 * @author tbrou
 *
 */
public class Main {

	/**
	 * main entry point for the program
	 * @param args to be defined
	 */
	public static void main(String[] args) {
		
		//initialize the use case
//		InvestmentAccount investmentAccount = new InvestmentAccount(10);
//		SavingsAccount savingsAccount = new SavingsAccount(10, 0.03);
//		Customer customer = new Customer("Thomas", "Paris", investmentAccount, savingsAccount);
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, enter a user name:");
		String userName = scanner.nextLine();
		System.out.println("and an address :");
		String userAddress = scanner.nextLine();
		System.out.println("Thank you, enter an initial balance for savings account : ");
		double initialBalance  = scanner.nextDouble(); //TODO, maybe not the better way to store that information
		scanner.nextLine();
		System.out.println("and an interest rate : ");
		double initialInterest = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("and an initial balance for investments : ");
		double initialBalanceForInvestments = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Input complete, thank you.");
		
		
		InvestmentAccount investmentAccount = new InvestmentAccount(initialBalanceForInvestments);
		SavingsAccount savingsAccount = new SavingsAccount(initialBalance, initialInterest);
		
		Customer customer = new Customer(userName, userAddress,investmentAccount, savingsAccount);
		
		
	
		// display the initial state
		System.out.println(investmentAccount);
		System.out.println(savingsAccount);
		System.out.println(customer);
		
		
		scanner.close();
		
	}

}
