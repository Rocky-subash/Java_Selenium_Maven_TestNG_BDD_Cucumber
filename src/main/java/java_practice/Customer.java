package java_practice;

public class Customer {

	public static void main(String[] args) {
		Axis mybank = new Axis();
		mybank.adharMandatory();
		boolean PanMandatory = mybank.panMandatory();
		System.out.println(PanMandatory);
		mybank.interestFreeLoan();
		System.out.println(Axis.UPIlimit);
	
	}

}
