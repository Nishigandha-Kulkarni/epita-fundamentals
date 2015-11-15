package fr.tbr.banksystem.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import fr.tbr.banksystem.datamodel.Customer;

public class CustomerFileDAO {

	// TODO to read this from a configuration
	private static final String outputFileName = "/test/daooutputs.txt";
	private PrintWriter writer;
	
	
	public CustomerFileDAO() throws FileNotFoundException, IOException {
		this.writer = getWriterFromFile(new File(outputFileName));
		
		
	}
	
	public void create(Customer customer) throws FileNotFoundException, IOException {
		writer.println("----customer-----");
		writer.println(customer.getName());
		writer.println(customer.getAddress());
		writer.println("-----------------");
	}

	public void close(){
		this.writer.close();
	}
	
	private PrintWriter getWriterFromFile(File file) throws IOException,
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
