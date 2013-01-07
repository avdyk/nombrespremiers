package be.mims.techdej.slf4j101AVD;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cette classe permet de parcourir la liste des nombres premiers de la classe
 * NombresPremiers.
 * 
 * @author <a href="mailto:avd@mims.be">Arnaud Vandyck</a>
 * 
 * @version 1.0.0
 */
public class NombresPremiersIterator implements Iterator<Long> {

	private static final Logger logger = LoggerFactory
			.getLogger(NombresPremiersIterator.class);

	private NombresPremiers nombresPremiers;

	private int index = 0;

	public NombresPremiersIterator(NombresPremiers nombresPremiers) {
		logger.debug("Création d'un itérateur de nombres premiers");
		this.nombresPremiers = nombresPremiers;
	}

	/**
	 * Retourne vrai s'il reste un nombre premier.
	 * @return <code>true</code> s'il reste un nombre premier.
	 */
	public boolean hasNext() {
		boolean resultat = this.index < this.nombresPremiers.size();
		logger.debug("index: {}; nombre de nombres premiers: {}; réponse: {}",
				this.index, this.nombresPremiers.size(), resultat);
		return resultat;
	}

	public Long next() {
		Long suivant = this.nombresPremiers.get(this.index++);
		logger.debug("suivant: {}", suivant);
		return suivant;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
