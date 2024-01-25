package com.cursojavaspring.mvc;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	@Before("execution(public * com.cursojavaspring.mvc.ProgrammerController.getProgrammers())")
	public void logBefore()
	{
		LOGGER.info("GetAliens method called from aspect");
	}
	
	@AfterReturning("execution(public * com.cursojavaspring.mvc.ProgrammerController.getProgrammers())")
	public void logAfter()
	{
		LOGGER.info("GetAliens method Executed");
	}
	
	@AfterThrowing("execution(public * com.cursojavaspring.mvc.ProgrammerController.getProgrammers())")
	public void logException()
	{
		LOGGER.info("Issue");
	}
}
