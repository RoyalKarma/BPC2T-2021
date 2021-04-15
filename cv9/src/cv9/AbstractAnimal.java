package cv9;

public abstract class AbstractAnimal { //abstraktni trida pro jednotlive zvirata
	private byte age;
	//konstruktor
	public AbstractAnimal(byte age) {
		
		this.age = age;
	}
	
//gettery a settery
	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
	//metoda na print zvuku
	public void sound() {
		
	}
}
