package Product;
import java.lang.*;
public class product1 {
    static void productDetails() {
    	String name="Laptop";
    	int price=45000;
    	String category="Electronics";
    	
    	System.out.println("Name : "+name);
    	System.out.println("price : "+price);
    	System.out.println("category : "+category);
    }
	public static void main(String[] args) {
		/*1. "Create a method to print product details (name, price, category)."
         → No return, no parameter  */
		
         productDetails();
	}

}
