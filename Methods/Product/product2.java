package Product;
import java.lang.*;
public class product2 {
	static double applyDiscount(double originalPrice,double discountPercent) {
		double discountAmount=(originalPrice*discountPercent)/100;
		return originalPrice-discountAmount;
		
	}

	public static void main(String[] args) {
		/*2. "Create a method to apply discount and return new price."
        → Return type, with parameters  
        newPrice = originalPrice - (originalPrice * discountPercent / 100)*/
		double price=1000.0;
		double discount=10.0;
		double newPrice=applyDiscount(price,discount);
		System.out.println("new price of product: "+newPrice);

	}

}
