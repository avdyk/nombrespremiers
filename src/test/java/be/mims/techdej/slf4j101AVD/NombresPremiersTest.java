package be.mims.techdej.slf4j101AVD;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test Pour NombresPremiers.
 */
public class NombresPremiersTest {

	private NombresPremiers prems = new NombresPremiers();

	@Test
	public void hasNextTest() {
		Assert.assertTrue(prems.iterator().hasNext());
	}

	@Test
	public void premierPremierTest() {
		Assert.assertEquals(new Long(2), prems.iterator().next());
	}

	@Test
	public void deuxiemePremierTest() {
		Iterator<Long> pr = this.prems.iterator();
		pr.next();
		Assert.assertEquals(new Long(3), pr.next());
	}

	@Test
	public void troisiemePremierTest() {
		Iterator<Long> pr = this.prems.iterator();
		pr.next();
		pr.next();
		Assert.assertEquals(new Long(5), pr.next());
	}

}
