package methods;
import java.lang.*;
public class Student {
	void printStudentDetails(){
		String name="sreeja";
		int rollNumber=25;
		String branch="EEE";
		System.out.println("printing student details");
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Branch: "+branch);
	}

	public static void main(String[] args) {
		//  "Object: Student"
        //1. "Create a method to print student details" (name, roll number, branch).
        //  → *No return, no parameter – non-static or static*
   Student obj=new Student();
   obj.printStudentDetails();
	}

}
