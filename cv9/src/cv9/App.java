package cv9;

/*
Abstraktní tøídy slouží ke generalizaci tøíd. Poskytuje metody odvozeným tøídám
i když žádnému konkrétnímu objektu neodpovídá.
Interface obsahuje pouze konstanty a metody. Specifikuje operace, které má tøída splòovat, a 
který se již nezabývá tím, jak toho bude konkrétnì dosaženo. Tøída mùže pracovat s neomezeným množství interface

Enum je pøehlednìjší a pracuje se s ním jednodušeji než se  definovanou konstantou, napø. chyba v pojmenování enum 
- kompilátor nás na ni upozorní, což by se u stringu nestalo.



@author Adam Tuèek
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
