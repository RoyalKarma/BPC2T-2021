
public class CustomException extends java.lang.Exception{ // Konstruktor kter� dopl�uje Exception class
	
	public CustomException() //v�jimka bez vstupu
	{
		super("Zad�n neplatn� pr�m�r");
	}
	public CustomException(String text) // v�jimka se vstupem
	{
		super(text);	
	}

}