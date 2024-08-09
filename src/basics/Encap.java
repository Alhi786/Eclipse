package basics;

class Stud
{
	private int studnumber;
	private String studname;
	public int getStudnumber() {
		return studnumber;
	}
	public void setStudnumber(int studnumber) {
		this.studnumber = studnumber;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	
	
}

public class Encap {

	public static void main(String[] args) {
		Stud s=new Stud();
		s.setStudnumber(101);
		s.setStudnumber(102);	
		System.out.println(s.getStudname("abcde"));
		
		

	}

}
