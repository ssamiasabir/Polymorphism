package com.polymorphism;

import java.util.ArrayList;

public class ArrayListLesson {

	public static void main(String[] args) {

// Here we are creating the class of arraylist that is premade in java util package
		
// arrone is the class name we keep 
		
		ArrayList<String> arrOne  = new ArrayList<>();
		
// now we can save alot string data in to one data type arrOne
		
		arrOne.add("Ahmed");
		arrOne.add("Meher");
		arrOne.add("Duree Sameen");
		arrOne.add("Amna Nusaibah");
		
		
// To see what we have in list by index
		System.out.println(arrOne.size());
		
// To see what we have in index 2
		System.out.println(arrOne.get(2));

		
// This is the way you can replace the value of any element in list
		arrOne.set(0,"Hussain");

		
//	To pull complete list           // Another method is i
		for (String compeleteList : arrOne ) {
			System.out.println(compeleteList);
			
		
			
			
		}
	}

}
