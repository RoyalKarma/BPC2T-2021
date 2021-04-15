package cv9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CatImpl implements Animal {
	//konstruktor
	public CatImpl(byte age) {
		
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
		System.out.println("meow");

	}

	@Override
	public String toString() {//prevedeni na string
		return "CatImpl [age=" + age + "]";
	}

	@Override
	public void save() {
		try {
			FileWriter fileWriter = new FileWriter("animals.txt", true); //otevreni souboru
			PrintWriter printWriter = new PrintWriter(fileWriter);//novy writer
			printWriter.println("meow"); //zapsani zvuku
			printWriter.close(); // zavreni writeru
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}