package fr.tbr.banksystem.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import fr.tbr.banksystem.dao.CustomerFileDAO;
import fr.tbr.banksystem.datamodel.Customer;

public class TestFileFromUserInput {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		// initializing the input
		Scanner scanner = new Scanner(System.in);

		// initializing the output
		CustomerFileDAO dao = new CustomerFileDAO();
		String answer = "y";

		while (answer.equals("y")) {
			// Begin one iteration
			System.out.println("Hello, input a customer name");
			String name = scanner.nextLine();

			System.out.println("Hello, input an address");
			String address = scanner.nextLine();
			Customer customer = new Customer(name, address);
			dao.create(customer);
			System.out.println("customer has been written in the file, would you like to continue (y|n)");
			answer = scanner.nextLine();
		}

		System.out.println("The program will finish now. Goodbye!");
		// after the loop, release the resources
		dao.close();
		scanner.close();

	}

	private static PrintWriter getWriterFromFile(File file) throws IOException,
			FileNotFoundException {
		if (file.exists()) {
			System.out.println("this file :" + file.getName()
					+ " exists on the file system");
		} else {
			System.out.println("the file does not exist (yet)");
			File parent = file.getParentFile();
			if (!parent.exists()) {
				parent.mkdirs();
			}
			file.createNewFile();

			System.out.println("creation successful");
		}

		// we are sure that the file exists now

		PrintWriter pw = new PrintWriter(file);

		return pw;
	}

}
