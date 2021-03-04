
public class CustomException extends java.lang.Exception{ // Konstruktor který doplòuje Exception class
	
	public CustomException() //výjimka bez vstupu
	{
		super("Zadán neplatný prùmìr");
	}
	public CustomException(String text) // výjimka se vstupem
	{
		super(text);	
	}

}