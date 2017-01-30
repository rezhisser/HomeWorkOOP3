import java.util.Arrays;

public class Group implements RecruitingOfficer {
	private Student [] st = new Student [10];

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Group(Student[] st) {
		super();
		this.st = st;
	}





	protected void addToGroup (Student a){
		for (int i = 0; i < st.length+1; i++) {
			if(st[i] != null){
				continue;
			}
			if (st[i]==null)
				st[i] = a;
			return;

		}

	}
	protected void delFromGroup (Student a){
		for (int i = 0; i < st.length; i++) {
			if(st[i] == a){
				st[i] = null;
			}
		}
		
	}
	
	protected Student searchStudent (String str){
		Student a = null;
		for (int i = 0; i < st.length; i++) {
			if(st[i] != null && st[i].getSecondName().equals(str)){
				a = st[i];
			}
		}
		return a;
		
	}
	
	protected void sort (){
		Arrays.sort(st,(a,b) ->chekNull(a,b)==2?a.getSecondName().compareTo(b.getSecondName()):chekNull(a,b));
	}
	
	protected void sort (CriterionSort cr){
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

	@Override
	public Student[] getStudetn18() {
		int count = 0;
		for (int i = 0; i < st.length; i++) {
			
			if (st[i].getAge() >= 18){
				count ++;
			}
			
		}
		
		Student stud [] = new Student [count];
		for (int i = 0; i < stud.length; ) {
			for (int j = 0; j < st.length; j++) {
				if (st[j].getAge() >= 18){
					stud[i] = st[j];
					i++;
				}
			}
		}
		
		return stud;
	}



	@Override
	public String toString() {
		
		
		String out = "Group: \n";
		for (Student student : st) {
			out += student + "\n";
		}
		return out;
	}












	
	
	
	



	
	

}
