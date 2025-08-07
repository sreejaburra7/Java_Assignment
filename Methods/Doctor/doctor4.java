package Doctor;
import java.lang.*;
public class doctor4 {
    boolean patientAdmission(boolean fever,boolean breathingProblem,boolean lowOxygen) {
    	if(fever || breathingProblem || lowOxygen) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
	public static void main(String[] args) {
		/*4. "Create a method to check if patient needs admission (based on symptoms)."
        → Return type, with parameters  */
		boolean fever=true;
		boolean breathingProblem=false;
		boolean lowOxygen=false;
		doctor4 obj=new doctor4();
		boolean res=obj.patientAdmission(fever,breathingProblem,lowOxygen);
		if(res) {
			System.out.println("Admitt the patient");
		}
		else {
			System.out.println("no need of admission");
		}

	}

}
