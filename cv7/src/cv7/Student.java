package cv7;

public class Student {
	public Student(String jmeno, int rocnik) {
		this.jmeno = jmeno;
		this.rocnik = rocnik;
	}

	public String getJmeno() {
		return jmeno;
	}

	public int getRocnik() {
		return rocnik;
	}

	public float getStudijniPrumer() {
		return studijniPrumer;
	}

	public boolean setStudijniPrumer(float studijniPrumer) {
		if (studijniPrumer < 1 || studijniPrumer > 5) { // prumer musi byt v rozmezi 1-5

			return false;
		}
		this.studijniPrumer = studijniPrumer;
		return true;
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}
