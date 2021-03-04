
public class Student {
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
	
	public float getStudijniPrumer() throws CustomException {  // getter který hodí Výjimku pokud nebyl zadán prùmìr
		if (studijniPrumer==0)
			throw new CustomException();
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws CustomException { //setter který vyhodí vyjímku pokud byl prùmìr zadán mimo povolené rozmezí
		if (studijniPrumer<1||studijniPrumer>5)
			throw new CustomException("Prosím zadejte prùmìr v rozmezí 1-5");
		this.studijniPrumer = studijniPrumer;
	}
	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}