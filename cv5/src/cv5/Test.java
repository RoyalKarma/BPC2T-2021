package cv5;

public class Test {

	public static void main(String[] args) {
		Zbozi[] array = new Zbozi[4];
		array[0] = new Potravina("Rohlik", 1.5, 1);
		array[1] = new Naradi("Kleste", 278.0, 24);
		array[2] = new Potravina("Chleba", 20.8, 6);
		array[3] = new Potravina("Jablko", 51.0, 20);

		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Potravina)
				System.out.println("Jmeno:" + array[i].getJmeno() + " cena: " + array[i].getCena() + " trvanlivost: "
						+ ((Potravina) array[i]).getTrvanlivost() + " " + array[i].getJednotka());

			else
				System.out.println("Jmeno:" + array[i].getJmeno() + " cena: " + array[i].getCena());
		}

	}

}
