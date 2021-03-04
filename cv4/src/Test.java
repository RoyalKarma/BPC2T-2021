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
			System.out.println("Prosím zadejte èíslo bez desetiných míst");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	public static float checkForNum(Scanner sc)  //kontrola, jestli bylo zadáno èíslo, funkènì stejné jako pouzeCelaCisla
	{
		float cislo = 0;
		try
		{
			cislo = sc.nextFloat();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.toString());
			System.out.println("Prosím, zadejte èíslo");
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
					catch (ArrayIndexOutOfBoundsException e) //kontrola jestli už nebyl array naplnìn
					{
						System.out.println("Databáze je již plná");
						System.out.println(e.toString());
					}
					
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					idx = pouzeCelaCisla(sc); // Input musí být celé èíslo
					prumer = checkForNum(sc); // Input musí být èíslo
					try
					{
						mojeDatabaze.setPrumer(idx,prumer);
					}
					catch(ArrayIndexOutOfBoundsException e) //kontrola indexu
					{
						System.out.println("Zvolený index je mimo rozsah databáze");
						System.out.println(e.toString());//vypsání chyby
					}
					catch (NullPointerException e) //kontrola existence položky s indexem
					{
						System.out.println("Zvolená položka neexistuje");
						System.out.println(e.toString()); //vypsání chyby
					}
					
					catch (CustomException e) //Custom exception - kontrolu validity prùmìru - musí být nenulový a menší než 5/ jestli byl vùbec zadán
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
					catch (CustomException e) //kontrola prùmìru
					{
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prùmìr nezadán");
						System.out.println(e.getMessage());
					}
					catch(ArrayIndexOutOfBoundsException e) //kontrola indexu - velikosti arraye
					{
						System.out.println("Zvolený index je mimo rozsah databáze");
						System.out.println(e.toString());//vypsání chyby
					}
					catch (NullPointerException e) //kontrola jestli v arrayi u daného indexu jsou zadány nìjaké informace
					{
						System.out.println("Zvolená položka neexistuje");
						System.out.println(e.toString());//vypsání chyby
					}
					
					break;
				case 5:
					run=false;
					break;
			}
			
		}
	}

}
