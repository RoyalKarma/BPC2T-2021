
public class CustomException extends java.lang.Exception{ // Konstruktor který doplòuje Exception class
	
	public CustomException() //výjimka bez vstupu
	{
		super("Nebyl zadan platny prumer");
	}
	public CustomException(String text) // výjimka se vstupem
	{
		super("Zadejte prumer v rozmezi 1-5");	
	}

}