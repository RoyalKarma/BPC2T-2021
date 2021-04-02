package cv7;

import java.util.Scanner;

public class Test {

	public static int pouzeCelaCisla(Scanner sc) {
		int cislo = 0;
		try {
			cislo = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nastala vyjimka typu " + e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}

	public static float pouzeCisla(Scanner sc) {
		float cislo = 0;
		try {
			cislo = sc.nextFloat();
		} catch (Exception e) {
			System.out.println("Nastala vyjimka typu " + e.toString());
			System.out.println("zadejte prosim cislo ");
			sc.nextLine();
			cislo = pouzeCisla(sc);
		}
		return cislo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Databaze mojeDatabaze = new Databaze();
		float prumer;
		int volba;
		String jmeno;
		int rok;
		boolean run = true;
		while (run) {
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vlozeni noveho studenta");
			System.out.println("2 .. nastaveni prumeru studenta");
			System.out.println("3 .. vypis informace o studentovi");
			System.out.println("4 .. odstraneni studenta ");
			System.out.println("5 .. vypis studentu ");
			System.out.println("6 .. ukonceni aplikace");

			volba = pouzeCelaCisla(sc);
			switch (volba) {
			case 1:
				System.out.println("Zadejte jmeno studenta a rok narozeni");
				jmeno = sc.next();
				rok = Test.pouzeCelaCisla(sc);
				if (!mojeDatabaze.setStudent(jmeno, rok)) // pokud uz student s timto jmenem existuje
					System.out.println("Student v databazi jiz existuje");
				break;
			case 2:
				System.out.println("Zadejte jmeno a prumer studenta");
				jmeno = sc.next();
				prumer = pouzeCisla(sc);
				if (!mojeDatabaze.setPrumer(jmeno, prumer)) // pokud ma zadany prumer null hodnotu
					System.out.println("Zadejte prumer v rozmezi 1-5");
				break;
			case 3:
				System.out.println("Zadejte jmeno studenta");
				jmeno = sc.next();
				Student info = null;
				info = mojeDatabaze.getStudent(jmeno);
				if (info != null) // pokud bylo jmeno nalezeno
					System.out.println("Jmeno: " + info.getJmeno() + " Rok narozeni: " + info.getRocnik() + " Prumer: "
							+ info.getStudijniPrumer());
				else
					System.out.println("Vybrana polozka neexistuje");
				break;
			case 4:
				System.out.println("Zadejte jmeno studenta k odstraneni");
				jmeno = sc.next();
				if (mojeDatabaze.vymazStudenta(jmeno)) // pokud bylo nalezeno shodne jmeno - smazat
					System.out.println(jmeno + " - byl odstranen ");
				else // pokud nebylo nalezeno
					System.out.println(jmeno + " - student nebyl nalezen ");
				break;
			case 5:
				mojeDatabaze.printDatabase(); // volani metody na vitisknuti cele databaze
				break;
			case 6:
				run = false;
				break;
			}

		}
	}

}
