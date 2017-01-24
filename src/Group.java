import java.util.Arrays;

public class Group {
	private Student [] st = new Student [10];

	public Group() {
		super();
		// TODO Auto-generated constructor stub
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
	



	@Override
	public String toString() {
		return "Group [st=" + Arrays.toString(st) + "]";
	}
	
	
	

}
