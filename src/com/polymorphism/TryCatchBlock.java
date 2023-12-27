package com.polymorphism;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;

public class TryCatchBlock {

	public static void main(String[] args) {

		
		
// Try catch block is to find the error we did or the unusual event happen in the implement of code and we can catch it through catch block once 
// we run the code step inside the try block
		
// Example
		
		ArrayList<String> arreTwo = new ArrayList<>();
		
		arreTwo.add("Sabir");
		arreTwo.add("Samia");
		arreTwo.add("Khalid");
		arreTwo.add("Saima");
		
		
// This is how we can catch the problem in code // It could be read data from excel file for instance User name and Password
		try {
			arreTwo.set(2, "Saamia");

		} catch (Exception e) {
			System.out.println(e +  "  **This step is not implimented**");		}

		////button[text()='close manu']
// //div[@class='fdfdf']
// ArrayList arrOne = new 
		
//	Use set to change the index value
//		arreTwo.set(4, "Chano");

// Always use simple for loop to get complete data from arraylist
		for (String familyList : arreTwo) {
			System.out.println(familyList);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
