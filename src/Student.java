
public class Student extends Human{
	private int group;
	private int course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int age, String gender, String firstName, String secondName, int group, int course) {
		super(age, gender, firstName, secondName);
		this.group = group;
		this.course = course;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	

	@Override
	public boolean equals(String str, CriterionSortSearch cr) {
		if (cr == cr.FirstName){
			return this.firstName.equals(str);
		}
		else if (cr == cr.SecondName){
			return this.secondName.equals(str);
		}
		else if (cr == cr.Gender){
			return this.gender.equals(str);
		} else return false;
	}
	
	@Override
	public boolean equals(int value, CriterionSortSearch cr) {
		if (cr == cr.Age){
			return this.age==value;
			}
		else if (cr == cr.Kurs){
			return this.course==value;
		}
		else if (cr == cr.Group){
			return this.group==value;
		}
		 else return false;
	}
	
	
	@Override
	public String toString() {
		return "Student [group=" + group + ", course=" + course + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getFirstName()=" + getFirstName() + ", getSecondName()=" + getSecondName() + "]";
	}

	

	

	
	

}
