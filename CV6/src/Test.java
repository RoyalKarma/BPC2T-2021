import java.io.IOException;
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
	


	public static void main(String[] args) throws CustomException, IOException, ClassNotFoundException {	
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
			System.out.println("5 .. vypis databaze");
			System.out.println("6 .. ulozeni do souboru");
			System.out.println("7 .. nacteni ze souboru");
			System.out.println("8 .. ukoncení aplikace");
			
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
						System.out.println("Databaze je plna");
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
						System.out.println("Index mimo platny rozsah");
						System.out.println(e.toString());//vypsání chyby
					}
					catch (NullPointerException e) //kontrola existence položky s indexem
					{
						System.out.println("Polozka neexistuje");
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
					
					catch(ArrayIndexOutOfBoundsException e) //kontrola indexu - velikosti arraye
					{
						System.out.println("Index mimo platny rozsah");
						System.out.println(e.toString());//vypsání chyby
					}
					catch (NullPointerException e) //kontrola jestli v arrayi u daného indexu jsou zadány nìjaké informace
					{
						System.out.println("Polozka neexistuje");
						System.out.println(e.toString());//vypsání chyby
					}
					
					break;
				case 5:
					mojeDatabaze.printDatabase();
					break;
				case 6:
					System.out.println("Zadejte jmeno souboru");
					String savename = sc.next();
					 mojeDatabaze.saveToFile(savename);

					break;
				case 7:
					System.out.println("Zadejte jmeno souboru");
					String loadname = sc.next();
					mojeDatabaze.readFromFile(loadname);
					break;
				case 8:
					run=false;
					break;
			}
			
		}
	}

}
