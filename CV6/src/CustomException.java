
public class CustomException extends java.lang.Exception{ // Konstruktor kter� dopl�uje Exception class
	
	public CustomException() //v�jimka bez vstupu
	{
		super("Nebyl zadan platny prumer");
	}
	public CustomException(String text) // v�jimka se vstupem
	{
		super("Zadejte prumer v rozmezi 1-5");	
	}

}