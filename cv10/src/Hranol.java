
public class Hranol extends Ctverec { // chyba 3 - typo v nazvu tridy

	// konstruktor se zadanim delky hrany, vysky a materialu
	Hranol(float podstava, float vyska, boolean drevena) {

		super(podstava);
		hrana = vyska;
		zeDreva = drevena; // chyba 4 - chybejici super
		pocetHranolu++;
	}

	// vypocet objemu hranolu
	float vypoctiObjem() {
		return vypoctiObsah() * hrana; // chyba 5 - chybny vypocet hranolu- puvodni vypocet by platil pro objem kvadru
	}

	// nastaveni materialu
	void setDreveny(boolean dreveny) {
		zeDreva = dreveny;
	}

	// zjisteni materialu
	boolean jeDreveny() {
		return zeDreva;
	}

	// zjisteni celkoveho poctu existujicich kostek
	static int getPocetHranolu() {
		return pocetHranolu;
	}

	// zjisteni vysky hranolu
	float getHrana() {
		return hrana;
	}

	// nastaveni vysky hranolu
	void setHrana(float delka) {
		hrana = delka;
	}

	private float hrana;
	boolean zeDreva;
	static int pocetHranolu = 0; // chyba 6 - final misto static -> hodnotu by neslo menit

}
