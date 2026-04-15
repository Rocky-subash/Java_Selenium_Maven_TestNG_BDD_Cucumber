package inheritance;

public class BMW extends Bike {
	int mileage = 20;
	
	String getColor() {
		return "limeStone red";
		
	}
	
	public static void main(String[] args) {
		BMW mybike = new BMW();
		System.out.println(mybike.mileage);
		System.out.println(mybike.getColor());
		System.out.println("My bike has disc "+mybike.hasDisc());
		mybike.applyBrake();
		mybike.hornMust();
	}
	

}
