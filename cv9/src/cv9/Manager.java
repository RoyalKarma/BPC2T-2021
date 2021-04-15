package cv9;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee { //inheritence ze tridy employee

	public Manager(String nickname, String email, char[] password) {
		super(nickname, email, password); //pristup ke konstruktoru ze tridy employee
	}
//Listy
	private List<Employee> listOfEmployees = new ArrayList<Employee>(); // zamestnanci
	private List<Employee> listOfRelationships = new ArrayList<Employee>(); //nastavene vztahy
//Gettery a settery
	public List<Employee> getListOfEmployees() {
		return listOfEmployees;
	}

	public void setListOfEmployees(List<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}

	public List<Employee> getListOfRelationships() {
		return listOfRelationships;
	}

	public void setListOfRelationships(List<Employee> listOfRelationships) {
		this.listOfRelationships = listOfRelationships;
	}
//pridani zamestnance do listu zamestnancu
	public void addEmploye(Employee em) {
		listOfEmployees.add(em);

	}

	public void addRelation(Employee sec) { //pridani vztahu do listu vztahu
		listOfRelationships.add(sec);

	}

	public void vypis1() {
		for (int i = 0; i < listOfEmployees.size(); i++) { //iterace listu zamestnancu
			System.out.println(listOfEmployees.get(i)); //print
		}
	}

	public void vypis2() {
		for (int i = 0; i < listOfRelationships.size(); i++) { //iterace listu nastavenych vztahu
			System.out.println(listOfRelationships.get(i)); // print
		}
	}

}
