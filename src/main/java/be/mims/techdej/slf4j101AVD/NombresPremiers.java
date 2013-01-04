package be.mims.techdej.slf4j101AVD;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NombresPremiers implements Iterable<Long> {

	private static final Logger logger = LoggerFactory
			.getLogger(NombresPremiers.class);

	private Long[] nombresPremiers;

	public NombresPremiers() {
		logger.debug("construction d'un tableau de 10 nombres premiers");
		this.nombresPremiers = new Long[10];
		this.nombresPremiers[0] = 2L;
		// FIXME recherche des dix premiers nombres premiers
	}

	public Long get(int index) {
		return this.nombresPremiers[index];
	}

	public int size() {
		return this.nombresPremiers.length;
	}

	public Iterator<Long> iterator() {
		return null;
	}

}
