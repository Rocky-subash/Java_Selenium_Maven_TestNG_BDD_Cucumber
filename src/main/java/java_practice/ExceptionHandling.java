package java_practice;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		 /*
		  * An excpetion is a unwanted event that distrupts the normal flow of a program execution 
		  * By exception handling we can ensure the normal flow of the application.
		  * 
		  * 
		  * Error :
		  * Impossible to recover from errors, 
		  * happen at run time , 
		  * Caused by the environment that the application is running.
		  * 
		  * 
		  * Exception :
		  * Recovery and handling possible 
		  * Runtime and compile time both 
		  * Caused by the application 
		  * Array Out of bounds excpetion  
		  * 
		  * Two type of exception 
		  * checked exeception:  Compile time exeception   SQL Exception, IOException ,ClassNotFound exception 
		  * Unchecked exeception : Runtime exeception.     
		  * 
		  */
		
		System.out.println("Enter some input: ");
		Scanner sc = new Scanner(System.in);
		
		//Try is a possitve block.
		try {
			int num = sc.nextInt();
			System.out.println(num);
			int a = num%0;
			System.out.println(a);
		}
		
		//Catch negative block , we can have multiple catch or nested catch.
		
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();  //prints the error message that usually observed in the run time .
			System.out.println(e.getMessage()); // display only the error message 
		}
		catch(Exception e ){
			
			
		}
		finally {
			sc.close();
			
			System.out.println("Completed");
		}
		
		
	}

}
