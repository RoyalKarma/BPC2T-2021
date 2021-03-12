package cv5;

public abstract class Zbozi {
	private String jmeno;
	private double cena;
	private static double dph = 1.21; // dph = 121% puvodni ceny
	
	Zbozi(String jmeno, double cena){ //konstruktor parent tridy, sem pristupujeme v dedicnych tridach pomoci super()
		this.jmeno = jmeno;
		this.cena= cena; 
		
	}
//gettery a settery
	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public double getCena() { //Vypocet ceny s DPH -> cena * 1.21 
		return cena * dph;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public static double getDPH() {
		return dph;
	}

	public static void setDPH(double dph) {
		Zbozi.dph = dph;
	}
//Abstraktní metoda
	public abstract String getJednotka();
	

}
