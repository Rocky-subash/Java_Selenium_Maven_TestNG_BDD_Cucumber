package java_practice;

public class Local_InstanceVariable {
	String Car_brand = "Hyundai";
	
	public String CarDetails(String Model) {
		return ("The car model is " + Model + " Company Name is " + this.Car_brand );
		
		
	}
	
	
	public static void main(String[] args) {
		
	Local_InstanceVariable car = new Local_InstanceVariable();
	System.out.println(car.CarDetails("I20"));
	}

}
