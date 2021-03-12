package cv5;

public class Potravina extends Zbozi {
	private int trvanlivost; //trvanlivost -> pouze cele cisla

	public Potravina(String jmeno, double cena, int trvanlivost) { //konstruktor child tridy
		super(jmeno, cena); //Volaní konstruktoru nadrazene tridy
		this.trvanlivost = trvanlivost;
	}
	//getter a settery
	public int getTrvanlivost() {
		return trvanlivost;
	}

	public void setTrvanlivost(int trvanlivost) {
		this.trvanlivost = trvanlivost;
	}

	@Override
	public String getJednotka() {
		return "dnu";
	}

}
