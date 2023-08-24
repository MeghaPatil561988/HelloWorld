package Strings;

public class toString {

	public static void main(String[] args) {
		student s1 = new student(21,"megha");
		//System.out.println(s1.rollno);
		//System.out.println(s1.sname);
		System.out.println(s1);//by deafault toString mrthod call here s1.toString()
	}

}


class student{
	int rollno;
	String sname;
	student(int rollno,String sname)
	{
		this.rollno=rollno;
		this.sname=sname;
	}
	
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", sname=" + sname + "]";
	}
}
