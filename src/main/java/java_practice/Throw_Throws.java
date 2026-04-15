package java_practice;

public class Throw_Throws {

	
		
		
		/*
		 * Throw - Java throw keyword is used to explicitly throw an exception 
		 * Throw is used with the method 
		 * You cannot have multiple throw 
		 * 
		 * 
		 * Throws 
		 * Throws is used to declare exception.
		 * Thows is used with the method signature .
		 * you can delcare multiple exceptions.  eg public void method throws IOException, NoSuchException.
		 * 
		 */
	
	//throws
	public void code1() throws InterruptedException {
		Thread.sleep(5000);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Throw_Throws lts = new Throw_Throws();
		lts.code1();
		
	}
	
}
	
	
	
	
	
	
	//Try catch 
	/*public void code()  {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw new RuntimeException();  // this line will display the exception and stop the program executon 
		}
		
	}
	public static void main(String[] args) {
		Throw_Throws lts = new Throw_Throws();
		lts.code(); 
	}
		

	}
	*/


