package cv5;

public class Test {

	public static void main(String[] args) {
		Zbozi[] arr = new Zbozi[4]; // vytvoreni Pole
		//naplneni pole
		arr[0] = new Potravina("Rohlik", 1.5, 1);
		arr[1] = new Naradi("Kleste", 278.0, 24);
		arr[2] = new Potravina("Chleba", 20.8, 6);
		arr[3] = new Potravina("Jablko", 51.0, 20);

		for (int i = 0; i < arr.length; i++) { //prochazeni arraye
			if (arr[i] instanceof Potravina) // pokud je položka patøí do tridy Potraviny- print s trvanlivostí
				System.out.println(arr[i].getJmeno() + ", cena: " + arr[i].getCena() + " trvanlivost: "
						+ ((Potravina) arr[i]).getTrvanlivost() + " " + arr[i].getJednotka());

			else // pokud nepatri - print se zarukou - tahle cast neodpovida zadani, ale jinak by implementace metody getJednotka  
				// ve tride Naradi byla zbytecna, takze predpokladam ze je to v poradku
		
				
				System.out.println(arr[i].getJmeno() + ", cena: " + arr[i].getCena() + " zaruka: "
						+ ((Naradi) arr[i]).getZaruka() + " " + arr[i].getJednotka());

		}

	}

}
