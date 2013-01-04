package be.mims.techdej.slf4j101AVD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * 
 */
public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("App start");
		System.out.println("Hello World!");
		logger.info("App stop");
	}
}
