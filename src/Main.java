
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student(34, "male", "Vadym", "Khivrenko", 5, 5);
		Student st2 = new Student(32, "female", "Olga", "Khivrenko", 5, 5);
		Student st3 = new Student(21, "male", "Oleg", "Petrenko", 5, 5);
		Student st4 = new Student(22, "female", "Vlada", "Ivanenko", 5, 5);
		Student st5 = new Student(23, "male", "Ivan", "Bojko", 5, 5);
		Student st6 = new Student(18, "female", "Tanya", "Prihodko", 5, 5);
		Student st7 = new Student(26, "female", "Kate", "Gopkalo", 5, 5);
		Student st8 = new Student(19, "male", "Vadym", "Lubatsky", 5, 5);
		Student st9 = new Student(28, "female", "Irina", "Khivrenko", 5, 5);
		Student st10 = new Student(21, "male", "Vadym", "Shevchnko", 5, 5);
		Student st11 = new Student(121, "male", "Vadym", "Shevchnko", 5, 5);
		
		Group gr = new Group();
		try{
		gr.addToGroup(st1);
		gr.addToGroup(st2);
		gr.addToGroup(st3);
		gr.addToGroup(st4);
		gr.addToGroup(st5);
		gr.addToGroup(st6);
		gr.addToGroup(st7);
		gr.addToGroup(st8);
		gr.addToGroup(st9);
		gr.addToGroup(st10);
		
		gr.addToGroup(st11);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("больше 10 нельзя");
		}
		
		gr.delFromGroup(st1);
		gr.delFromGroup(st1);
		
		System.out.println(gr.toString());
		
		System.out.println(gr.searchStudent("Petrenko"));
		
		
		

	}

}
