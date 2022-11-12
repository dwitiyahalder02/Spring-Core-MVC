package com.navinredy.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//when you add component annotation spring tells that spring is responsible for creating object of alien class
public class Alien {

	@Autowired
	Laptop lap;
	
	public void code()
	{
		//System.out.println("i am coding");
		lap.compile();
	}
}
