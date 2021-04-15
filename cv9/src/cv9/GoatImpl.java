package cv9;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

	public class GoatImpl implements Animal {
		//konstruktor
		public GoatImpl(byte age) {
			
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
			System.out.println("MAAAAAH");

		}

		@Override
		public String toString() { //prevedeni na string
			return "GoatImpl [age=" + age + "]";
		}

		@Override
		public void save() {
			try {
				FileWriter fileWriter = new FileWriter("animals.txt", true); //vytvoreni souboru
				PrintWriter printWriter = new PrintWriter(fileWriter); // vytvoreni writeru
				printWriter.println("MAAAAAH"); //zapsani zvuku
				printWriter.close(); // ukonceni writeru
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

