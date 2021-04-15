package cv9;

/*
Abstraktn� t��dy slou�� ke generalizaci t��d. Poskytuje metody odvozen�m t��d�m
i kdy� ��dn�mu konkr�tn�mu objektu neodpov�d�.
Interface obsahuje pouze konstanty a metody. Specifikuje operace, kter� m� t��da spl�ovat, a 
kter� se ji� nezab�v� t�m, jak toho bude konkr�tn� dosa�eno. T��da m��e pracovat s neomezen�m mno�stv� interface

Enum je p�ehledn�j�� a pracuje se s n�m jednodu�eji ne� se  definovanou konstantou, nap�. chyba v pojmenov�n� enum 
- kompil�tor n�s na ni upozorn�, co� by se u stringu nestalo.



@author Adam Tu�ek
*/

public class App {

	public static void main(String[] args) {

		char[] pass = { 'a', 'b', 'c', 'd', 'e' }; // heslo
		// vytvoreni instanci
		Employee e1 = new Employee("e1", "aaa@mail.com", pass);
		Employee e2 = new Employee("e2", "ddd@mail.com", pass);
		Employee e3 = new Employee("e3", "iii@mail.com", pass);
		Employee e4 = new Employee("e4", "lll@mail.com", pass);
		Employee e5 = new Employee("e5", "ppp@mail.com", pass);
		Manager m1 = new Manager("m1", "add@mail.com", pass);
		Secretarian s1 = new Secretarian("s1", "bbb@mail.com", pass, 25);
		Secretarian s2 = new Secretarian("s2", "ddd@mail.com", pass, 27);

		m1.addEmploye(e1); // pridano do listu zamestnancu
		m1.addEmploye(e2);// pridano do listu zamestnancu
		m1.addEmploye(e3);// pridano do listu zamestnancu
		m1.addEmploye(e4);// pridano do listu zamestnancu
		m1.addEmploye(e5);// pridano do listu zamestnancu
		m1.addRelation(s1); // pridano do list vztahu
		m1.vypis1(); // print zamestnancu
		m1.vypis2(); // print vztahu s managerem

		byte a = 5;
		// instance
		Cat c = new Cat(a);
		Dog d = new Dog(a);
		Pig p = new Pig(a);
		Cow cw = new Cow(a);
		Goat g = new Goat(a);
		// print zvuku
		c.sound();
		d.sound();
		p.sound();
		cw.sound();
		g.sound();

		// instance
		CatImpl ca = new CatImpl(a);
		DogImpl dog = new DogImpl(a);
		PigImpl pi = new PigImpl(a);
		GoatImpl go = new GoatImpl(a);
		CowImpl cow = new CowImpl(a);
		// printy zvuku a ulozeni do souboru
		ca.save();
		ca.sound();
		dog.save();
		dog.sound();
		pi.save();
		pi.sound();
		go.save();
		go.sound();
		cow.save();
		cow.sound();

	}

}
