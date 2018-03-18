package gumetest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {

	private AutoGuma a;

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testGetMarkaModel() {
		a.setMarkaModel("Tigar");
		String marka = a.getMarkaModel();
		assertEquals("Tigar", marka);
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Tigar");
		assertEquals("Tigar", a.getMarkaModel());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNULL() {
		a.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKRACIOD3() {
		a.setMarkaModel("ab");
	}

	@Test
	public void testGetPrecnik() {
		a.setPrecnik(17);
		assertEquals(17, a.getPrecnik());
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);
		assertEquals(15, a.getPrecnik());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikMANJI() {
		a.setPrecnik(10);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVECI() {
		a.setPrecnik(30);
	}

	@Test
	public void testGetSirina() {
		a.setSirina(200);
		assertEquals(200, a.getSirina());
	}

	@Test
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(200, a.getSirina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaMANJI() {
		a.setSirina(50);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVECI() {
		a.setSirina(450);
	}

	@Test
	public void testGetVisina() {
		a.setVisina(70);
		assertEquals(70, a.getVisina());
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaMANJI() {
		a.setVisina(10);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVECI() {
		a.setVisina(100);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(17);
		a.setSirina(200);
		a.setVisina(50);
		assertEquals("AutoGuma [markaModel=Tigar, precnik=17, sirina=200, visina=50]", a.toString());
	}

}
