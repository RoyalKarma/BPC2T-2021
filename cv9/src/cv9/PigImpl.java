package cv9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PigImpl implements Animal {
	//pristup ke konstruktoru
	public PigImpl(byte age) {
		
		this.age = age;
	}

	private byte age;
//gettery a settery
	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public void sound() {
		System.out.println("oink");

	}

	@Override
	public String toString() { //prevedeni na string
		return "PigImpl [age=" + age + "]";
	}

	@Override
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("animals.txt", true); //otevreni souboru
			PrintWriter printWriter = new PrintWriter(fileWriter); //vytvoreni writeru
			printWriter.println("oink"); //zapis
			printWriter.close(); // zavreni
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}