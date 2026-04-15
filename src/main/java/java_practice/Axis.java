package java_practice;

public class Axis implements RBI { //Implemets keywod 
	
	public void interestFreeLoan() {
		
		System.out.println("Freeloan");
	}
	
	
	@Override
	public void adharMandatory() {
		System.out.println("Aadhar added");		
	}

	@Override
	public boolean panMandatory() {
		return true;
		
	}
	/*
	 * implemets keywork is used to implemet all the method of interface(RBI)
	 * all logics must me declared we cannot skip any logics of inteface
	 * 
	 */
}

