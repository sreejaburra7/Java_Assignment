package methods;
import java.lang.*;
public class Student2 {
	int totalMarksof3(int s1,int s2,int s3) {
		return s1+s2+s3;
	}
	public static void main(String[] args) {
		// 2. "Create a method to calculate total marks of 3 subjects."
		 //  → Return total marks – return type, with parameters
		Student2 obj=new Student2();
		System.out.println("printing totalMarks of 3");
		int sub1=35;
		int sub2=45;
		int sub3=55;
		int total=obj.totalMarksof3(sub1,sub2,sub3);
		System.out.println(total);

	}

}
