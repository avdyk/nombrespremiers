package be.mims.techdej.slf4j101AVD;

import java.util.Iterator;

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
		System.out.println("Affichage des 10 premiers nombres premiers");
		NombresPremiers np = new NombresPremiers();
		Iterator<Long> iter = np.iterator();
		for (int i = 0; i < 10 && iter.hasNext(); i++) {
			System.out.println(iter.next());
		}
		logger.info("App stop");
	}
}
