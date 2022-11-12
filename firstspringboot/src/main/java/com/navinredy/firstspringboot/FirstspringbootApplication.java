package com.navinredy.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstspringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstspringbootApplication.class, args);
		//if i am creating the object by myself then i am responsible for everythig.I 
		//don't want it.
		//Alien obj = new Alien();
		
		
		//I am telling spring give me a object. By we can't all getbean directly.
		//There is a interface called ApplicationContext we need to use that getbean method is a part of this interface.
		
		
		Alien obj=context.getBean(Alien.class);
		obj.code();
	}

}
