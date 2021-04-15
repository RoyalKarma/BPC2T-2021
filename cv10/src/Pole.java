import java.util.Scanner;

public class Pole {

	// Konstruktor s velikosti pole
	Pole(int velikost) {
		mojeHranoly = new Hranol[velikost];
		sc = new Scanner(System.in);
	}

	// vlozeni hranolu do pole na prvni volnou pozici
	void zadejHranol() {
		boolean drevena = false;
		float delka = 0;
		float vyska = 0;
		System.out.println("Zadejte delku podstavy hranolu");
		while (!sc.hasNextFloat()) {
			sc.next();
		}
		delka = sc.nextFloat();
		System.out.println("Zadejte vysku hranolu");
		while (!sc.hasNextFloat()) {
			sc.next();
		}
		vyska = sc.nextFloat();
		System.out.println("Je drevena?");
		while (!sc.hasNextBoolean()) // chyba 7 Zmìna float na boolean
		{
			sc.next();
		}
		drevena = sc.nextBoolean();
		if (Hranol.getPocetHranolu() == mojeHranoly.length) 
		{
			System.out.println("Pole uz je zaplneno");
			return;
		}
		mojeHranoly[Hranol.getPocetHranolu()] = new Hranol(delka, vyska, drevena); // chyba 8- nevytvari se objekt
																					// hranolu

	}

	// vypis objemu vsech hranolu
	void vypoctiObjem() {
		for (int i = 0; i < Hranol.getPocetHranolu(); i++)
			System.out.println("Objem " + i + ". hranolu je " + mojeHranoly[i].vypoctiObjem()); // chyba 9 - vypocti
																								// obsah na objem
	}

	// vypis obsahu podstavy vsech hranolu
	void vypoctiObsahPodstavy() {
		for (int i = 0; i < Hranol.getPocetHranolu(); i++)
			System.out.println("Obsah podstavy " + i + ". hranolu je " + mojeHranoly[i].vypoctiObsah()); // chyba 10 -
																											// vypocti
																											// objem na
																											// obsah
	}

	// nalezeni indexu nejmensiho hranolu
	int najdiNejmensiObjem() {
		float min = Float.MAX_VALUE; // chyba 11- pri nastaveni minima na 0 by nebylo mozne ve srovnani dosahnout
										// minima
		int idx = 0;
		for (int i = 0; i < Hranol.getPocetHranolu(); i++) {
			if (mojeHranoly[i].vypoctiObjem() < min) {
				min = mojeHranoly[i].vypoctiObjem();
				idx = i;
			}
		}
		return idx;
	}

	// zjisteni celkoveho poctu drevenych kostek
	int zjistiPocetDrevenych() {
		int pocetDrevenych = 0;
		for (int i = 0; i < Hranol.getPocetHranolu(); i++) // chyba 12 - chybny for loop, i= 0, <
		{
			if (mojeHranoly[i].zeDreva == true) // chyba 13 - operator = místo ==
				pocetDrevenych++;
		}
		return pocetDrevenych;
	}

	private Scanner sc;
	private Hranol[] mojeHranoly;
}
