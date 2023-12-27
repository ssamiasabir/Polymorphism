package com.polymorphism;

public class CheckTravelDetails {

	public static void main(String[] args) {

		Student st1 = new Student("samia");
		
		Transpotasion T1 = new Plane("West");
		Transpotasion T2 = new Bus("Bus5");
		
		st1.travel("pak", T1);
		st1.travel("Madina", T2);
		
	}

}
