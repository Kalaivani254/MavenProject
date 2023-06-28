package com.onebill.readcsv;

import java.io.File;
import java.util.Scanner;

public class WithoutMultithreadCSV {

	public static void main(String[] args) throws Exception 
	{
		
		Scanner a = new Scanner(new File("/home/kalaivani/Downloads/sample.csv"));  
		a.useDelimiter(" ");  
		while (a.hasNext())  
		{  
		System.out.print(a.next());    
		}    
	} 

}
