package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int experience;

Employee(String name,int sal,int exp){
	ename=name;
	salary=sal;
	experience= exp;
}
}
public class Predicate2 {

	public static void main(String[] args) {
		
		//EX1
		Employee emp = new Employee("megha",40000,5);	
		Predicate<Employee> pr = e->(e.salary>30000 && e.experience<5);
		//System.out.println(pr.test(emp));
		
		//EX2
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("megha",40000,3));
		al.add(new Employee("david",20000,1));
		al.add(new Employee("john",50000,4));
		al.add(new Employee("scot",30000,6));
		
		for( Employee e : al) {
			if(pr.test(e)) {
				System.out.println(e.ename+" "+e.salary);
			}
		}
	}

}
