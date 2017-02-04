import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Student st1 = new Student(14, "male", "Vadym", "Khivrenko", 5, 5);
		Student st2 = new Student(12, "female", "Olga", "Khivrenko", 5, 5);
		Student st3 = new Student(21, "male", "Oleg", "Petrenko", 5, 5);
		Student st4 = new Student(2, "female", "Vlada", "Ivanenko", 5, 5);
		Student st5 = new Student(23, "male", "Ivan", "Bojko", 5, 5);
		Student st6 = new Student(18, "female", "Tanya", "Prihodko", 5, 5);
		Student st7 = new Student(16, "female", "Kate", "Gopkalo", 5, 5);
		Student st8 = new Student(19, "male", "Vadym", "Lubatsky", 5, 5);
		Student st9 = new Student(8, "female", "Irina", "Khivrenko", 5, 5);
		Student st10 = new Student(1, "male", "Vadym", "Shevchnko", 5, 5);
		Student st11 = new Student(1, "male", "Vadym", "Shevchnko", 5, 5);
		
		
		Group gr = new Group();
		try{
		gr.addStudent(st1);
		gr.addStudent(st2);
		gr.addStudent(st3);
		gr.addStudent(st4);
		gr.addStudent(st5);
		gr.addStudent(st6);
		gr.addStudent(st7);
		gr.addStudent(st8);
		gr.addStudent(st9);
		gr.addStudent(st10);
		
		gr.addStudent(st11);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("больше 10 нельзя");
		}
		
	//	gr.delFromGroup(st10);
		gr.delFromGroup(st1);
		
		System.out.println(gr);		
		System.out.println("search" + gr.searchStudent("Petrenk", CriterionSortSearch.SecondName));
		
		gr.sort();
		
		System.out.println(gr);
		
		
		
		gr.sort(CriterionSortSearch.Age);
		System.out.println(gr);
		
		gr.sort(CriterionSortSearch.FirstName);
		System.out.println(gr);
		
		System.out.println("***");
		
		System.out.println("getStudentForRecruitingOfficer - " + Arrays.toString(gr.getStudetnForRecruitingOfficer()));
		
		
		

	}

}
