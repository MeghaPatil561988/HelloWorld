package encapsulation;

public class EncapsulationDemo 
{
public static void main(String[] args)
{
	Emp e1=new Emp();
	e1.setEmpid(101);
	e1.setEmpname("megha");
	Emp e2=new Emp();
	e2.setEmpid(102);
	e2.setEmpname("swapnil");;
	
	System.out.println(e1.getEmpid());
	System.out.println(e1.getEmpname());

	System.out.println(e2.getEmpid());
	System.out.println(e2.getEmpname());
}
}
class Emp
{
	private int empid;
	private String empname;
	
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid = empid;
	}
	public String getEmpname()
	{
		return empname;
	}
	public void setEmpname(String empname)
	{
		this.empname = empname;
	}
	
}
