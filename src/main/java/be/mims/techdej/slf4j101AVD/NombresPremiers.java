package be.mims.techdej.slf4j101AVD;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class NombresPremiers implements Iterable<Long> {

	private static final Logger logger = LoggerFactory
			.getLogger(NombresPremiers.class);

	private Long[] nombresPremiers;

	public NombresPremiers() {
		logger.debug("construction d'un tableau de 10 nombres premiers");
		this.nombresPremiers = new Long[10];
		this.nombresPremiers[0] = 2L;
		// recherche des dix premiers nombres premiers
		long nbr = 3L;
		int i = 1;
		Marker marker = MarkerFactory.getMarker("recherchePremiers");
		logger.debug(marker, "recherche de {} nombres premiers",
				this.nombresPremiers.length);
		while (i < this.nombresPremiers.length) {
			boolean premier = true;
			int index = 0;
			while (index < i && premier) {
				premier = nbr % this.nombresPremiers[index] != 0;
				logger.trace(marker, "{} est-il premier? {}", nbr, premier);
				index++;
			}
			if (premier) {
				this.nombresPremiers[i] = nbr;
				i++;
				logger.debug(marker, "nouveau nombre premier: {}", nbr);
			}
			nbr++;
		}
	}

	public Long get(int index) {
		return this.nombresPremiers[index];
	}

	public int size() {
		return this.nombresPremiers.length;
	}

	public Iterator<Long> iterator() {
		return new NombresPremiersIterator(this);
	}

}
