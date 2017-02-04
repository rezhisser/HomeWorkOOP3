
public abstract class Human {
	protected int age;
	protected String gender;
	protected String firstName;
	protected String secondName;
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
	@Override
	public String toString() {
		return "Human [age=" + age + ", gender=" + gender + ", firstName=" + firstName + ", secondName=" + secondName
				+ "]";
	}
	public boolean equals(String str, CriterionSortSearch cr) {
		if (cr == cr.FirstName){
			return this.firstName.equals(str);
		}
		else if (cr == cr.SecondName){
			return this.secondName.equals(str);
		}
	//	else if (cr == cr.Age){
	//		return this.age==obj;
	//	}
		else if (cr == cr.Gender){
			return this.gender.equals(str);
		} else return false;
	}
	
	


	
	
	
	

}
