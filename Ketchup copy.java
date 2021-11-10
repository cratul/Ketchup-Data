/* 
Name: Celine Ratulowski
Date: February 24, 2021
Description: Reads a ketchup data file, then calculates and prints how many bottles of each brand 
was sold, and now much money was made from the sales of each brands
Sources: Our class' powerpoint slides
 */

import java.io.*;
import java.util.Scanner;


public class Ketchup {

	public static void main(String[] args) throws IOException {
		File myFile = new File("ketchupData.txt");
		//creates a new file from ketchup.txt
		Scanner scan = new Scanner(myFile);
		//creates a scanner
		int heinzCount = 0, huntsCount = 0, delmonteCount = 0, stbCount = 0;
		double heinzTotal = 0, huntsTotal = 0, delmonteTotal = 0, stbTotal = 0;
		//initializes variables
		
		String line = scan.nextLine();
		//skips the column names in the txt file
		 
		while (scan.hasNext()) //while there is more to read from the file
		{
			String brand = scan.next();  //sets the first column as the ketchup brand names

			
			double heinzPrice = scan.nextDouble();  
			double huntsPrice = scan.nextDouble();
			double delmontePrice = scan.nextDouble();
			double stbPrice = scan.nextDouble();
			//assigns bottle prices for that time of purchase
			
			if (brand.equals("heinz")) {
				heinzCount++;
				heinzTotal += heinzPrice;}
			if (brand.equals("hunts")) {
				huntsCount++;
				huntsTotal+=huntsPrice;}
			if (brand.equals("delmonte")) {
				delmonteCount++;
				delmonteTotal+= delmontePrice;}
			if (brand.equals("stb")){
				stbCount++;
				stbTotal+= stbPrice;}
			//finds what brand was purchased and increments the total amount of bottles purchased and adds to money made from purchase
		
		}

		System.out.println("The total number of Heinz bottles purchased is: " + heinzCount);
		System.out.println("The total number of Hunts bottles purchased is: " + huntsCount);
		System.out.println("The total number of Delmonte bottles purchased is: " + delmonteCount);
		System.out.println("The total number of store brand bottles purchased is: " + stbCount);
		System.out.println("The total amount of money made by selling Heinz bottles is: " + heinzTotal);
		System.out.println("The total amount of money made by selling Hunts bottles is: " + huntsTotal);
		System.out.println("The total amount of money made by selling Delmonte bottles is: " + delmonteTotal);
		System.out.println("The total amount of money made by selling store brand bottles is: " + stbTotal);
		//prints out the final results
		
		scan.close();  //closes scanner
			
	}

}
