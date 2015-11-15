package fr.tbr.banksystem.tests;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTests {
	
	
	
	public static void main(String[] args) throws IOException{
		File file = new File("/tests/subtests/subsubtests/myfirstfile.txt");
		
		
		if(file.exists()){
			System.out.println("this file :" + file.getName() + " exists on the file system");
		}else{
			System.out.println("the file does not exist (yet)");
			File parent  = file.getParentFile();
			if(!parent.exists()){
				parent.mkdirs();
			}
			file.createNewFile();
			
			System.out.println("creation successful");			
		}
		
		//we are sure that the file exists now
		
		PrintWriter pw = new PrintWriter(file);
		
		pw.println("Hello!");
		
		pw.close();
		
		
	
	}

}
