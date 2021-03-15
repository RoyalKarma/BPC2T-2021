import java.io.Serializable;

public class Student implements Serializable {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer()  {  // getter kter� hod� v�jimku pokud nebyl zad�n pr�m�r
	
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws CustomException { //vyj�mka pokud byl pr�m�r zad�n mimo povolen� rozmez�
		if (studijniPrumer<1||studijniPrumer>5)
			throw new CustomException("Zadan nespravny prumer");
		else
			this.studijniPrumer = studijniPrumer;
	
	}
	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}