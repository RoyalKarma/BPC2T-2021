import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.toString());
			System.out.println("Pros�m zadejte ��slo bez desetin�ch m�st");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	public static float checkForNum(Scanner sc)  //kontrola, jestli bylo zad�no ��slo, funk�n� stejn� jako pouzeCelaCisla
	{
		float cislo = 0;
		try
		{
			cislo = sc.nextFloat();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.toString());
			System.out.println("Pros�m, zadejte ��slo");
			sc.nextLine();
			cislo = checkForNum(sc);
		}
		return cislo;
	}
	


	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(sc.nextInt());
					break;
				case 2:
					try
					{
						mojeDatabaze.setStudent();
					}
					catch (ArrayIndexOutOfBoundsException e) //kontrola jestli u� nebyl array napln�n
					{
						System.out.println("Datab�ze je ji� pln�");
						System.out.println(e.toString());
					}
					
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					idx = pouzeCelaCisla(sc); // Input mus� b�t cel� ��slo
					prumer = checkForNum(sc); // Input mus� b�t ��slo
					try
					{
						mojeDatabaze.setPrumer(idx,prumer);
					}
					catch(ArrayIndexOutOfBoundsException e) //kontrola indexu
					{
						System.out.println("Zvolen� index je mimo rozsah datab�ze");
						System.out.println(e.toString());//vyps�n� chyby
					}
					catch (NullPointerException e) //kontrola existence polo�ky s indexem
					{
						System.out.println("Zvolen� polo�ka neexistuje");
						System.out.println(e.toString()); //vyps�n� chyby
					}
					
					catch (CustomException e) //Custom exception - kontrolu validity pr�m�ru - mus� b�t nenulov� a men�� ne� 5/ jestli byl v�bec zad�n
					{
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					System.out.println("Zadejte index studenta");
					idx=pouzeCelaCisla(sc);
					Student info= mojeDatabaze.getStudent(idx);;
					try 
					{	
						info=mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
						
					}
					catch (CustomException e) //kontrola pr�m�ru
					{
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " pr�m�r nezad�n");
						System.out.println(e.getMessage());
					}
					catch(ArrayIndexOutOfBoundsException e) //kontrola indexu - velikosti arraye
					{
						System.out.println("Zvolen� index je mimo rozsah datab�ze");
						System.out.println(e.toString());//vyps�n� chyby
					}
					catch (NullPointerException e) //kontrola jestli v arrayi u dan�ho indexu jsou zad�ny n�jak� informace
					{
						System.out.println("Zvolen� polo�ka neexistuje");
						System.out.println(e.toString());//vyps�n� chyby
					}
					
					break;
				case 5:
					run=false;
					break;
			}
			
		}
	}

}
