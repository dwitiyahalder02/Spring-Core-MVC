package com.navinreddy.springcore;

public class Alien {

	int age=10;
	public Computer com;
	
	public Alien()
    {		System.out.println("alien obj created");
	}
	
//	public Alien(int age) {
//		
//		this.age = age;
//	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("age assigned");
	}
	
	public void code()
	{
		System.out.println("i am coding");
		com.compile();
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
	
}
