
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
	
	public float getStudijniPrumer() throws CustomException {  // getter kter� hod� V�jimku pokud nebyl zad�n pr�m�r
		if (studijniPrumer==0)
			throw new CustomException();
		return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws CustomException { //setter kter� vyhod� vyj�mku pokud byl pr�m�r zad�n mimo povolen� rozmez�
		if (studijniPrumer<1||studijniPrumer>5)
			throw new CustomException("Pros�m zadejte pr�m�r v rozmez� 1-5");
		this.studijniPrumer = studijniPrumer;
	}
	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}