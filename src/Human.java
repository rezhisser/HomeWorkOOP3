
public abstract class Human {
	private int age;
	private String gender;
	private String firstName;
	private String secondName;
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Human(int age, String gender, String firstName, String secondName) {
		super();
		this.age = age;
		this.gender = gender;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	


	
	
	
	

}