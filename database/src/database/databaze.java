package database;
//xtucek08

public class databaze {

	// bod 3 - konstruktor
	public databaze(String jmeno, int rocnik) {
		this.jmeno = jmeno;
		this.rocnik = rocnik;
	}

	// gettery - bod 4
	public String getJmeno() {
		return jmeno;
	}

	public int getRocnik() {
		return rocnik;
	}

	public double getUvazek() {
		return uvazek;
	}

	// bod 6
	public boolean pridejUvazek(double uvazek) {
		if (this.uvazek + uvazek > maximalniUvazek)
			return false;
		this.uvazek += uvazek;
		return true;
	}

	public static void setMaximalniUvazek(double maxUvazek) {
		maximalniUvazek = maxUvazek; // bod 5
	}

	// promìnné pro osobu, rok, uvazek - bod 1
	private String jmeno;
	private int rocnik;
	private double uvazek = 0;
	private static double maximalniUvazek = 1; // staticka promìna - bod 2

}
