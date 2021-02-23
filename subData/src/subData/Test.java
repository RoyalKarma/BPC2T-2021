package subData;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BPC1 p1 = new BPC1();
		BPC2 p2 = new BPC2();
		BPIS p3 = new BPIS();

		// BPC1
		while (true) {

			int num;
			sc = new Scanner(System.in);
			System.out.println(p1.getName() + " | Zadejte bodov� hodnocen� cvi�en� (max.20):");
			if (!sc.hasNextInt()) {

				System.out.println("Neplatn� hodnota");
				sc.next();

			}
			num = sc.nextInt();
			if ((num >= 0) && (num < 21)) {

				p1.setLecturePoints(num);
				break;
			} else {
				System.out.println("Neplatn� hodnota");

			}

		}

		while (true) {
			int num;
			sc = new Scanner(System.in);
			System.out.println(p1.getName() + " | Zadejte bodov� hodnocen� z�v�re�n� zkou�ky (max.80):");
			if (!sc.hasNextInt()) {

				System.out.println("Neplatn� hodnota");
				sc.next();

			}

			num = sc.nextInt();

			if ((num >= 0) && (num < 81)) {
				p1.setTestPoints(num);
				break;
			}
			else {
				System.out.println("Neplatn� hodnota");
			}
		}

		System.out.println(p1.getName() + " | Sou�et bod� je " + p1.getPoints());

		// BPC2
		while (true) {

			int num;
			System.out.println(p2.getName() + " | Zadejte bodov� hodnocen� projektu� (max.30):");
			sc = new Scanner(System.in);
			if (!sc.hasNextInt()) {

				System.out.println("Neplatn� hodnota");
				sc.next();

			}

			num = sc.nextInt();

			if ((num >= 0) && (num < 31)) {
				p2.setProjectPoints(num);
				break;
			}
			else {
				System.out.println("Neplatn� hodnota");
			}
		}

		while (true) {
			int num;
			System.out.println(p2.getName() + " | Zadejte bodov� hodnocen� p�lsemestr�ln�ho testu� (max.20):");
			sc = new Scanner(System.in);
			if (!sc.hasNextInt()) {

				System.out.println("Neplatn� hodnota");
				sc.next();

			}

			num = sc.nextInt();

			if ((num >= 0) && (num < 21)) {
				p2.setMidtermPoints(num);
				break;
			}
			else {
				System.out.println("Neplatn� hodnota");
			}
		}
		while (true) {
			int num;
			System.out.println(p2.getName() + " | Zadejte bodov� hodnocen� z�v�re�n� zkou�ky� (max.50):");
			sc = new Scanner(System.in);
			if (!sc.hasNextInt()) {

				System.out.println("Neplatn� hodnota");
				sc.next();

			}

			num = sc.nextInt();

			if ((num >= 0) && (num < 51)) {
				p2.setFinaltestPoints(num);
				break;
			}
			else {
				System.out.println("Neplatn� hodnota");
			}
		}
		System.out.println(p2.getName() + " | Sou�et bod� je " + p2.getPoints());
		// BPIS
		while (true) {

			int num;
			System.out.println(p3.getName() + " | Zadejte bodov� hodnocen� (max.100):");
			sc = new Scanner(System.in);
			if (!sc.hasNextInt()) {

				System.out.println("Neplatn� hodnota");
				sc.next();

			}

			num = sc.nextInt();

			if ((num >= 0) && (num < 101)) {
				p3.setPoints(num);
				break;
			}
			else {
				System.out.println("Neplatn� hodnota");
			}

		}
		System.out.println(p3.getName() + " | Po�et bod� je " + p3.getPoints());
		
		p1.getPass();
		p2.getPass();
		p3.getPass();
		sc.close();
	}
	
}
