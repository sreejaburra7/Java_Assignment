package Product;
import java.lang.*;
public class product3 {
     static int stock(int quantity) {
    	 if(quantity>0) {
    		 System.out.println("stock available");
    		 return 1;
    	 }
    	 else {
    		 System.out.println("stock not available");
    		 return 0;
    	 }
     }

	public static void main(String[] args) {
		/*3. "Create a method to check if product is available in stock (based on quantity)."
        → Return type, with parameter   */
		int quantity=5;
		stock(quantity);

	}

}
