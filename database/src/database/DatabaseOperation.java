package database;

import java.util.Scanner;

public class DatabaseOperation {

	public static void main(String[] args) {

		databaze[] databazeOsob = new databaze[3]; // bod 1 - pole objekt� - velikost 3
		Scanner sc;
		for (int i = 0; i < 3; i++) { // proch�zen� index�
			System.out.println("Index : " + (i + 1));
			System.out.print("Zadejte jm�no: ");// zad�v�n� z�kladn�ch udaj� - bod 2
			sc = new Scanner(System.in);
			String jmeno = sc.next(); 
			while (true) {
				System.out.print("Zadejte rok narozen�: ");
				sc = new Scanner(System.in);
				if (sc.hasNextInt())
					break;
				else
					System.out.println("Neplatn� hodnota"); // neplatn� hodnota -> zeptej se znovu
				sc.close();
			}
			int rocnik = sc.nextInt(); //ulo�en� hodnot
			databazeOsob[i] = new databaze(jmeno, rocnik);
		}
		
		while (true) { // nastaven� max �vazku
			System.out.print("Zadejte maxim�ln� v��i �vazku: "); //bod 3
			sc = new Scanner(System.in);
			if (sc.hasNextDouble()) {
				databaze.setMaximalniUvazek(sc.nextDouble()); // platn� hodnota -> ulo�en�
				break; // ukon�en� po �sp�n�m nav��en�
			} else
				System.out.println("Neplatn� hodnota"); // pokud se zad� neplatn� hodnota -> zeptej se znovu
		}
		
		while (true) { // nav��en� �vazku- bod 4
			System.out.print("Zadejte index osoby a v��i �vazku: ");
			sc = new Scanner(System.in);
			int num = sc.nextInt() - 1;
			double uvazek = sc.nextDouble();
			System.out.print(databazeOsob[num].getJmeno() + " " + databazeOsob[num].getRocnik()); // print jm�na, ro�n�k
			if (databazeOsob[num].pridejUvazek(uvazek))
				System.out.println(" �vazek byl nav��en na " + databazeOsob[num].getUvazek()); // �sp�n� nav��en�
			else
				System.out.println(" �vazek nelze nav��it"); // p�ekro�en� max hodnoty-> zeptej se znovu
		}
	}

}
