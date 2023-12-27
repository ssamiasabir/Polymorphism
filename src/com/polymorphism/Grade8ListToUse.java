package com.polymorphism;

//here we create a runable class and want to class the methods that we created in child classses and other class which is not extanded with parent classs
// for example student8 class
// we create an object of st1 class and call the parent class to use which laptop we gonna use and we pass the value and then call the one function
// from then st1 class to act the way it has been set up.
public class Grade8ListToUse {

	public static void main(String[] args) {

		
		
		Student8 st1 = new Student8("Amna");
		Computer cm = new ChromeBook("Note Pad");
		Computer cm2 = new MacBook("Apple laptop");

		
		st1.eletronics("8", cm2);
	}

}
