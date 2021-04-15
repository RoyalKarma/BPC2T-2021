package cv9;

public class Secretarian extends Employee { //inheritence ze tridy Employee

	private int age;

    public Secretarian(String nickname, String email, char[] password,  int age) {
        super(nickname, email, password); //pristup k nadrazenemu konstruktoru
        this.age = age;
    }
    //getter a setter pro vek
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
