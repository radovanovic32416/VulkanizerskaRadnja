package gume;

/**
 * Klasa AutoGuma koja sadrzi atribute markuModel, precnik, sirinu i visinu
 * gume, i metode toString i equals, zajedno sa getter-ima i setter-ima
 * 
 * @author Luka Radovanovic
 * @version 1.0.0
 * 
 */
public class AutoGuma {

	/**
	 * Atribut koji predstavlja marku i model gume
	 */
	private String markaModel = null;

	/**
	 * Atribut koji predstavlja precnik gume
	 */
	private int precnik = 0;

	/**
	 * Atribut koji predstavlja sirinu gume
	 */
	private int sirina = 0;

	/**
	 * Atribut koji predstavlja visinu gume
	 */
	private int visina = 0;

	/**
	 * Getter za markaModel atribut
	 * 
	 * @return vraca marku i model gume koji je tipa String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Setter za markaModel atribut
	 * 
	 * @param markaModel
	 *            koji je tipa String i predstavlja marku i model gume
	 * @throws java.lang.RuntimeException.class
	 *             izuzetak koji se baca u slucaju da je markaModel null ili duzina
	 *             istog manja od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Getter za precnik atribut
	 * 
	 * @return vraca precnik gume koji je tipa int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Setter za precnik atribut
	 * 
	 * @param precnik
	 *            koji je tipa int i predstavlja precnik gume
	 * @throws java.lang.RuntimeException.class
	 *             izuzetak koji se javlja u slucaju da je vrednost atributa precnik
	 *             manja od 13 ili veca od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Getter za sirina atribut
	 * 
	 * @return vraca sirinu gume koja je tipa int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Setter za sirina atribut
	 * 
	 * @param sirina
	 *            koja je tipa int i predstavlja sirinu gume
	 * @throws java.lang.RuntimeException.class
	 *             izuzetak koji se javlja u slucaju da je vrednost atributa sirina
	 *             manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Getter za visina atribut
	 * 
	 * @return vraca visinu gume koja je tipa int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Setter za visina atribut
	 * 
	 * @param visina
	 *            koja je tipa int i predstavlja visinu gume
	 * @throws java.lang.RuntimeException.class
	 *             izuzetak koji se javlja u slucaju da je vrednost atributa visina
	 *             manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * toString metoda za klasu AutoGuma
	 * 
	 * @return vraca citav jedan String sa svim podacima o jednoj gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * equals metoda za klasu AutoGuma
	 * 
	 * @param objekat
	 *            obj klase Object koji bi trebalo da bude guma
	 * @return
	 *         <ul>
	 *         <li>true - ako je objekat isti kao i uneti objekat
	 *         <li>false - ako objekti koji se porede nisu isti
	 *         </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
