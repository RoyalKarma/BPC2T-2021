class Ctverec {

	private float hrana;
	// vypocet obsahu ctverce
	float vypoctiObsah(){					
		return (float)(hrana*hrana);		 //chyba 2 - float - obsah muze byt desetine cislo
	}
	// zjisteni delky hrany ctverce
	float getHrana(){					
		return hrana;
	}
	// nastaveni delky hrany ctverce
	void setHrana(float delka){			
		hrana=delka;
	}
	// konstruktor se zadanim delky hrany ctverce
	Ctverec(float hrana){				
		this.hrana=hrana;		 //Chyba 1 - chybejici this.	
	}
}
