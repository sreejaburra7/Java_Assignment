package car;

public class car1 {
	void printCarDetails() {
		String brand="tesla";
		int model=2019;
		int price=5000000;
		System.out.println("brand : "+brand);
		System.out.println("model : "+model);
		System.out.println("price : "+price);
	    
	}

	public static void main(String[] args) {
		// 1. "Create a method to print car details (brand, model, price)."
		//  → No return, no parameter
		car1 obj=new car1();
		obj.printCarDetails();
	}

}
