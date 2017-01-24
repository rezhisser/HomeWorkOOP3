
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
	

	

	
	

}
