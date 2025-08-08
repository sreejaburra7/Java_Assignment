package car;
import java.lang.*;
public class car3 {
    void maintenanceAlert(int km) {
    	if(km>5000) {
    		System.out.println("alert of maintenance .Please service it.");
    		
    	}
    	else {
    		System.out.println("drive upto 5000km only before maintenance");
    	}
    }
	public static void main(String[] args) {
		//3. "Create a method to print maintenance alert if kilometers > 5000."
	   // → No return, with parameter
		int km=6000;
		car3 obj=new car3();
		obj.maintenanceAlert(km);
	}

}
