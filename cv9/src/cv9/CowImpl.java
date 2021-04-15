package cv9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CowImpl implements Animal {
	//konstruktor
	public CowImpl(byte age) {
		
		this.age = age;
	}

	private byte age;
//gettery a setery
	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public void sound() {
		System.out.println("mooo");

	}

	@Override
	//prevedeni na string
	public String toString() {
		return "CowImpl [age=" + age + "]";
	}

	@Override
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("animals.txt", true); //otevreni souboru
			PrintWriter printWriter = new PrintWriter(fileWriter); // zapisovac 
			printWriter.println("mooo"); //print zvuku
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
