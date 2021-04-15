package cv9;

public class Employee implements Comparable<Employee> {
	private String nickname;
	private String email;
	private char[] password;
	
	
	private EmployeeType employeeType;

    public Employee(String nickname, String email, char[] password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
       
    }

	public String getEmail() {
		return email;
	}

	public String getNickname() {
		return nickname;
	}

	public char[] getPassword() {
		return password;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}
	 public EmployeeType getEmployeeType() {
	        return employeeType;
	    }

	    public void setEmployeeType(EmployeeType employeeType) {
	        this.employeeType = employeeType;
	    }
	@Override
	public int compareTo(Employee stu) {
        return this.getEmail().compareTo(stu.getEmail());
    }
	@Override
	public String toString() {
		return "nickname:" + nickname + ", email:" + email;
	}
}
