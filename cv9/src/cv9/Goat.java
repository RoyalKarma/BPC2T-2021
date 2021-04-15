package cv9;

public class Goat extends AbstractAnimal {
	public Goat(byte age) {
		super (age);//pristup k nadrazenemu konstruktoru
			}
	@Override
	public void sound() {//print zvuku
		System.out.println("MAAAAAH");
	}
}
