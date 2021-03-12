package cv5;

public class Naradi extends Zbozi {
	
	private int zaruka; //pouze cele cisla

	public Naradi(String jmeno, double cena, int zaruka) { //konstruktor child tridy
		super(jmeno, cena); //Volaní konstruktoru nadrazene tridy
		this.zaruka = zaruka;
	}
//gettery a settery
	public int getZaruka() {
		return zaruka;
	}

	public void setZaruka(int zaruka) {
		this.zaruka = zaruka;
	}

	@Override
	public String getJednotka() {
		return "mesicu";
	}
	
	
	

}