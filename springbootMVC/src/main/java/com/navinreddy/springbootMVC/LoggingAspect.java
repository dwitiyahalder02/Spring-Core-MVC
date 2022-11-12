package com.navinreddy.springbootMVC;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	public static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution( public * com.navinreddy.springbootMVC.AlienController.getAliens())")
	public void logBefore()
	{
		//System.out.println("getaliens method called");
		logger.info("getaliens method called before" );
	}
	
	@After("execution( public * com.navinreddy.springbootMVC.AlienController.getAliens())")
	public void logAfter()
	{
		//System.out.println("getaliens method called");
		logger.info("getaliens method called after");
	}
}
