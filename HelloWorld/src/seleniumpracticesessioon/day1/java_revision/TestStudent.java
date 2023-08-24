package seleniumpracticesessioon.day1.java_revision;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {
	public static void main(String[] args) {
		Set<Student> setOfStudents = new HashSet<Student>();
        Student student1 = new Student(1, "John", 21);
        Student student2 = new Student(2, "Peter", 20);
        Student student3 = new Student(3, "David", 22);
        
        setOfStudents.add(student1);
        setOfStudents.add(student2);
        setOfStudents.add(student3);
        
        displayAllStudents(setOfStudents);
	}

	public static void displayAllStudents(Set<Student> setOfStudents) 
	{
		  for(Student student:setOfStudents) {
	            System.out.println(student);
	        }
		
	}
}
