package com.polymorphism;


public class Student {
	
	
	public String name;

	public Student(String name) {
		this.name = name;
	}
	void travel(String destination, Transpotasion transpotaion ) {
		System.out.println(this.name + " is going to " + destination + " by " + transpotaion.name);
	}
	

} 
