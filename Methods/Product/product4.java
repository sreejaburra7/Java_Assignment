package Product;
import java.lang.*;
public class product4 {
	static void outOfStock(int quantity) {
	  if(quantity==0) {
		System.out.println("alret: product is out of stock");
	  }
	  else {
		  System.out.println("product is available");
	  }
	}

	public static void main(String[] args) {
		/*4. "Create a method to print out-of-stock alert."
        → No return, with parameter   */
        int quantity=0;
        outOfStock(quantity);
	}

}
