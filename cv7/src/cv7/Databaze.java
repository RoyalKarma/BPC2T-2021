package cv7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Databaze {
	// vytvoreni hashmap
	Databaze() {
		prvkyDatabaze = new HashMap<String, Student>();
	}

	private Map<String, Student> prvkyDatabaze;

	public boolean setStudent(String jmeno, int rok) {
		if (prvkyDatabaze.put(jmeno, new Student(jmeno, rok)) == null)// pokud uz student s timto jmenem
																		// neexistuje-vytvor ho
			return true;
		else // pokud existuje - hashmap nemuze mit 2 studenty se stejnym jmenem
			return false;
	}

	public Student getStudent(String jmeno) {
		return prvkyDatabaze.get(jmeno);
	}

	public boolean setPrumer(String jmeno, float prumer) {
		if (prvkyDatabaze.get(jmeno) == null) // pokud nebylo jmeno nalezeno-false
			return false;
		return prvkyDatabaze.get(jmeno).setStudijniPrumer(prumer);// nastaveni prumeru
	}

	public boolean vymazStudenta(String jmeno) {
		if (prvkyDatabaze.remove(jmeno) != null)
			return true;
		return false;
	}

	public void printDatabase() { // metoda pro vypsani jmen z databaze
		Set<String> key = prvkyDatabaze.keySet(); // klic

		for (String jmeno : key)
			System.out.println(jmeno);
	}

}
