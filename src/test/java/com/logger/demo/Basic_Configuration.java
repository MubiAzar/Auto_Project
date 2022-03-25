package com.logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	
	//Factory Design Pattern
	
	public static Logger log = Logger.getLogger(Basic_Configuration.class);
	
	public static void main(String[] args) {
		
		// Configuration
		
		BasicConfigurator.configure(); 
		
		log.debug("debug");
		
		log.info("info");
		
		log.warn("warn");
		
		log.error("error");
		
		log.fatal("fatal");
		
		
		
	}

}
