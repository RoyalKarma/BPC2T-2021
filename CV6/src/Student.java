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
	
	public float getStudijniPrumer()  {  // getter který hodí výjimku pokud nebyl zadán prùmìr
	
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws CustomException { //vyjímka pokud byl prùmìr zadán mimo povolené rozmezí
		if (studijniPrumer<1||studijniPrumer>5)
			throw new CustomException("Zadan nespravny prumer");
		else
			this.studijniPrumer = studijniPrumer;
	
	}
	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}