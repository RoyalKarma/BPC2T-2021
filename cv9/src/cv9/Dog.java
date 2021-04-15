package cv9;

public class Dog extends AbstractAnimal {
	public Dog(byte age) {
		super(age);
			}
	@Override
	public void sound() {
		System.out.println("bork");
	}
}
