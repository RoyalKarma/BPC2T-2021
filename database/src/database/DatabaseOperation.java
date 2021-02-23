package database;

import java.util.Scanner;

public class DatabaseOperation {

	public static void main(String[] args) {

		databaze[] databazeOsob = new databaze[3]; // bod 1 - pole objektù - velikost 3
		Scanner sc;
		for (int i = 0; i < 3; i++) { // procházení indexù
			System.out.println("Index : " + (i + 1));
			System.out.print("Zadejte jméno: ");// zadávání základních udajù - bod 2
			sc = new Scanner(System.in);
			String jmeno = sc.next(); 
			while (true) {
				System.out.print("Zadejte rok narození: ");
				sc = new Scanner(System.in);
				if (sc.hasNextInt())
					break;
				else
					System.out.println("Neplatná hodnota"); // neplatná hodnota -> zeptej se znovu
				sc.close();
			}
			int rocnik = sc.nextInt(); //uložení hodnot
			databazeOsob[i] = new databaze(jmeno, rocnik);
		}
		
		while (true) { // nastavení max úvazku
			System.out.print("Zadejte maximální výši úvazku: "); //bod 3
			sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				databaze.setMaximalniUvazek(sc.nextDouble()); // platná hodnota -> uložení
				break; // ukonèení po úspìšném navýšení
			} else
				System.out.println("Neplatná hodnota"); // pokud se zadá neplatná hodnota -> zeptej se znovu
		}
		
		while (true) { // navýšení úvazku- bod 4
			System.out.print("Zadejte index osoby a výši úvazku: ");
			sc = new Scanner(System.in);
			int num = sc.nextInt() - 1;
			double uvazek = sc.nextDouble();
			System.out.print(databazeOsob[num].getJmeno() + " " + databazeOsob[num].getRocnik()); // print jména, roèník
			if (databazeOsob[num].pridejUvazek(uvazek))
				System.out.println(" Úvazek byl navýšen na " + databazeOsob[num].getUvazek()); // úspìšné navýšení
			else
				System.out.println(" Úvazek nelze navýšit"); // pøekroèení max hodnoty-> zeptej se znovu
		}
	}

}
