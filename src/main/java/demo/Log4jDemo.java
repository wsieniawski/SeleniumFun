package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n Hello world! \n");
		
		logger.trace("This is trace message.");
		logger.info("This is information message.");
		logger.error("This is an error message.");
		logger.warn("This is an warning message.");
		logger.fatal("This is an fatal error message.");
		
		System.out.println("Completed");
	}

}
