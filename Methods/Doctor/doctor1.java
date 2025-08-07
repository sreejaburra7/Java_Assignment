package Doctor;
import java.lang.*;
public class doctor1 {
	void doctorDetails() {
		String name="Soumya Kandula";
		String specialization="Cardiologist";
		System.out.println("Name : "+name);
		System.out.println("Specialization : "+specialization);
		
	}

	public static void main(String[] args) {
		/* 1. "Create a method to print doctor’s name and specialization."
	    → No return, no parameter*/
		doctor1 obj=new doctor1();
		obj.doctorDetails();
	}

}
