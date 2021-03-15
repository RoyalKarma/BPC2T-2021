import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Databaze implements Serializable {

	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
	
	public Databaze(int pocetPrvku) // Databázový Array
	{
		prvkyDatabaze=new Student[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setStudent() // Setter pro nastavení jména a roku studentu
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=Test.pouzeCelaCisla(sc); //rok musí být celé èíslo
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx) // Getter pro prvky databáze
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws CustomException // setter pro prùmìr + pøedání CustomException
	{
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	public void printDatabase()
	{
		for (int i=0;i<prvkyDatabaze.length;i++){
			System.out.println(" Jmeno: "+prvkyDatabaze[i].getJmeno() +" Rok narozeni: " + prvkyDatabaze[i].getRocnik() + 
					" Studijni prumer: " + prvkyDatabaze[i].getStudijniPrumer());
			
		}
	}
	public void saveToFile(String savename) throws IOException  {
		try(FileOutputStream f = new FileOutputStream(savename);
			    ObjectOutput s = new ObjectOutputStream(f)) {
			    s.writeObject(prvkyDatabaze);
			   
		}
	}
	
	public void readFromFile(String loadname) throws IOException, ClassNotFoundException{
		
		try(FileInputStream in = new FileInputStream(loadname);
		    ObjectInputStream s = new ObjectInputStream(in)) {
		    prvkyDatabaze = (Student[]) s.readObject();
		    
		}
		
}

	
		
}