package cv9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DogImpl implements Animal {
	//konstuktor
	public DogImpl(byte age) {
		this.age = age;
	}

	private byte age;
//gettery  a settery
	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public void sound() {
		System.out.println("bork");

	}

	@Override //prevedeni na string
	public String toString() {
		return "DogImpl [age=" + age + "]";
	}

	@Override
	//zapsani do souboru
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("animals.txt", true); //otevreni souboru
			PrintWriter printWriter = new PrintWriter(fileWriter); // zapisovac 
			printWriter.println("bork"); //print zvuku
			printWriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}