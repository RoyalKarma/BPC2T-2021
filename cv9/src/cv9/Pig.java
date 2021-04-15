package cv9;

public class Pig extends AbstractAnimal {
	public Pig(byte age) {
		super(age); //pristup k nadrazenemu konstruktoru
			}
	@Override
	public void sound() { //print zvuku
		System.out.println("oink");
	}

}
