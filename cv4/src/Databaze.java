import java.util.Scanner;

public class Databaze {
	public Databaze(int pocetPrvku) // Datab�zov� Array
	{
		prvkyDatabaze=new Student[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setStudent() // Setter pro nastaven� jm�na a roku studentu
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=Test.pouzeCelaCisla(sc); //rok mus� b�t cel� ��slo
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx) // Getter pro prvky datab�ze
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws CustomException // setter pro pr�m�r + p�ed�n� CustomException
	{
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
}