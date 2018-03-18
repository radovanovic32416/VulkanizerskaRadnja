package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa VulkanizerskaRadnja koja ima jedan atribut koji je lista objekata klase
 * AutoGuma i 2 metode, dodavanje i pronalazenje gume
 * 
 * @author Luka Radovanovic
 * @version 1.9.1
 *
 */
public class VulkanizerskaRadnja {

	/**
	 * Atribut gume koji predstavlja listu objekata klase AutoGuma i odmah je
	 * inicijalizovan
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda za dodavanje gume, dodaje se na pocetak liste
	 * 
	 * @throws
	 *             <ul>
	 *             <li>java.lang.NullPointerException.class ako je uneti objekat
	 *             null
	 *             <li>java.lang.RuntimeException.class ako uneti objekat vec
	 *             postoji u listi
	 *             </ul>
	 * @param a
	 *            koji predstavlja jedan objekat klase AutoGuma koji se unosi kao
	 *            novi clan liste
	 */
	public void dodajGumu(AutoGuma a) {

		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Metoda za pronalazenje svih guma koje imaju marku i model kao uneti String
	 * 
	 * @param markaModel
	 *            je tipa String i predstavlja marku i model trazene gume
	 * @return vraca listu objekata klase AutoGuma koji imaju marku i model kao
	 *         uneti String
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;

		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();

		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));

		return novaLista;
	}

}
