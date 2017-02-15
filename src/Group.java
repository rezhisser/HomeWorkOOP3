import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Group implements RecruitingOfficer {
	//private Student [] st = new Student [10];
	private ArrayList <Student> st = new ArrayList<Student>(10);

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Group(ArrayList<Student> st) {
		super();
		this.st = st;

	}

	/*
	public Group(Student[] st) {
		super();
		this.st = st;
	}
	*/
	
	/*
	protected void addStudent (Student student){
		for (int i = 0; i < st.length+1; i++) {
			if(st[i] != null){
				continue;
			}
			if (st[i]==null)
				st[i] = student;
			return;

		}

	}
	*/
	protected void addStudent (Student student) throws MyExeption{
		if(st.size() <10){
			st.add(student);
		}
		else{
			System.out.println("переполнение");
			//throw new MyExeption();
		}
		
		
	}
	
	/*
	protected void delFromGroup (Student student){
		for (int i = 0; i < st.length; i++) {
			if(st[i] != null && st[i].equals(student)){
				st[i] = null;
			}
		}
		
	}
	*/
	protected void delFromGroup (Student student){
		st.remove(student);
	}
	
	
	/*
	protected Student [] searchStudent (String str, CriterionSortSearch cr){
		
		int count = 0;
		try {
		for (int i = 0; i < st.length; i++) {
			if(st[i] != null && st[i].equals(str, cr)){
				count++;
			}
		}
		if (count == 0)	throw new MyExeption();
			} catch (MyExeption e) {
				System.out.println("Нет такого студента - критерий: " + str + " / " + cr);
			}
		Student stud [] = new Student [count];
		for (int i = 0; i < stud.length;) {
			for (int j = 0; j < st.length; j++) {
				if(st[j] != null && st[j].equals(str, cr)){
					stud[i] = st[j];
					i++;
				}
			}
		}
		return stud;
		
	}
	*/
	protected ArrayList <Student> searchStudent (String str, CriterionSortSearch cr){
		
		ArrayList <Student> stud = new ArrayList<Student>();
		for (Student student : st) {
			if (student.equals(str, cr)){
				stud.add(student);
			}
		}
		if (stud.size()==0){
			System.out.println("нет такого студента - критерий поиска: " + cr + ", значение: " + str);
		}
		
		
		return stud;
	}
	
	
	
	/*
	protected Student [] searchStudent (int value, CriterionSortSearch cr){

		int count = 0;
		for (int i = 0; i < st.length; i++) {
			if(st[i] != null && st[i].equals(value, cr)){
				count++;
			}
		}
		Student stud [] = new Student [count];
		for (int i = 0; i < stud.length;) {
			for (int j = 0; j < st.length; j++) {
				if(st[j] != null && st[j].equals(value, cr)){
					stud[i] = st[j];
					i++;
				}
			}
		}
		return stud;
		
	}
	
	*/
	
	protected ArrayList <Student> searchStudent (int value, CriterionSortSearch cr){
		
		ArrayList <Student> stud = new ArrayList<Student>();
		for (Student student : st) {
			if (student.equals(value, cr)){
				stud.add(student);
			}
		}
		return stud;
	}
	
	/*
	
	protected void sort (){
		Arrays.sort(st,(a,b) ->chekNull(a,b)==2?a.getSecondName().compareTo(b.getSecondName()):chekNull(a,b));
	}
	
	protected void sort (CriterionSortSearch cr){
		if (cr == cr.FirstName){
			Arrays.sort(st,(a,b) ->chekNull(a,b)==2?a.getFirstName().compareTo(b.getFirstName()):chekNull(a,b));
		}
		else if (cr == cr.SecondName){
			Arrays.sort(st,(a,b) ->chekNull(a,b)==2?a.getSecondName().compareTo(b.getSecondName()):chekNull(a,b));
		}
		else if (cr == cr.Gender){
			Arrays.sort(st,(a,b) ->chekNull(a,b)==2?a.getGender().compareTo(b.getGender()):chekNull(a,b));
		}
		else if (cr == cr.Age){
			Arrays.sort(st,(a,b) ->chekNull(a,b)==2?a.getAge() - b.getAge():chekNull(a,b));
		}
	}
	
	public static int chekNull(Object a, Object b) {
		if ((a != null) && (b == null)) {
			return 1;
		}
		if ((a == null) && (b != null)) {
			return -1;
		}
		if ((a == null) && (b == null)) {
			return 0;
		}
		return 2;

	}
	
	*/
	
	protected void sort (){
		Comparator<Student> compareStudent = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String str1 = o1.getFirstName();
		        String str2 = o2.getFirstName();
		       
		        return str1.compareTo(str2);
			}
		};
		
		Collections.sort(st, compareStudent);
		
	}
	
	/*
	
	protected void sort (CriterionSortSearch cr){
		
		if (cr == cr.FirstName){
			
		}
		else if (cr == cr.SecondName){
			
		}
		else if (cr == cr.Gender){
			
		}
		else if (cr == cr.Age){
			
		}
		
	}
	
	*/
	
	/*

	@Override
	public Student[] getStudetnForRecruitingOfficer() {
		
		//считаем, сколько студентов удовлетворяют критерию 18+
		int count = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i] == null){
				continue;
			}
			else if (st[i].getAge() >= 18){
				count ++;
			}
			
		}
		System.out.println(count);
		
		Student stud [] = new Student [count];
		for (int i = 0; i < stud.length; ) {
			for (int j = 0; j < st.length; j++) {
				if (st[j] != null && st[j].getAge() >= 18){
					stud[i] = st[j];
					i++;
				}
			}
		}
		
		return stud;
	}
	
	*/
	
	@Override
	public ArrayList <Student> getStudetnForRecruitingOfficer() {
		
		ArrayList <Student> stud = new ArrayList<Student>();
		for (Student student : st) {
			if (student.getAge() >=18){
				stud.add(student);
			}
		}
		return stud;
		
	}
	
	
    public void SaveToFile(String path) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(path)) {
            for (Student student : st) {
            	if(student != null){
    			pw.print(student.getGroup() + ";");
    			pw.print(student.getCourse() + ";");
    			pw.print(student.getAge() + ";");
    			pw.print(student.getGender() + ";");
    			pw.print(student.getFirstName() + ";");
    			pw.print(student.getSecondName() + ";");
    			pw.println();
            	}
            }
        } catch (FileNotFoundException e) {
            System.out.println();
        }
    }
    
    public void LoadFile (String path, Group gr) throws MyExeption{
    	
    	try(BufferedReader f =new BufferedReader(new FileReader(path))){
    			String str="";
    			String[] tmp;
    			for(;(str=f.readLine())!=null;){
    				Student tmpStud = new Student();
                    tmp = str.split(";");
                    tmpStud.setGroup(Integer.parseInt(tmp[0]));
                    tmpStud.setCourse(Integer.parseInt(tmp[1]));
                    tmpStud.setAge(Integer.parseInt(tmp[2]));
                    tmpStud.setGender((tmp[3]));
                    tmpStud.setFirstName((tmp[4]));
                    tmpStud.setSecondName((tmp[5]));
                    gr.addStudent(tmpStud);
    			}
    			
    			}
    			catch(IOException e){
    			System.out.println("ERROR");
    			}
    }
    
    /* 
     * вместо этого метода есть split()
     * 
    protected String [] GetElementStringLine (String str){
    	int count = 0;
		for (char string : str.toCharArray()) {
			if(string == ';'){
				count++;
			}
			
		}
		String [] tmpstr = new String[count];
		
		for (int i = 0; i < count; i++) {
			int index = str.indexOf(';');
			String substr = str.substring(0, index);
			tmpstr[i]=substr;
			//System.out.println("substr - " + substr);
			String substrlast = str.substring(index+1,str.length());
			str=substrlast;
		}
		return tmpstr;
		
    }
    
    */



	@Override
	public String toString() {
		
		
		String out = "Group: \n";
		for (Student student : st) {
			out += student + "\n";
		}
		return out;
	}












	
	
	
	



	
	

}
