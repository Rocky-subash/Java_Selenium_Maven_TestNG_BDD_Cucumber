package java_practice;

public interface RBI {
	int UPIlimit = 100000; //now matter what variable is devlared it will be condisered as static final.
	  void adharMandatory(); // Defalut r public access modifier 
	 public boolean panMandatory(); 
	 // intereface will not have body 
	 default void housingLoan() {
		 System.out.println("");
	 }
	 static void bikeloan(){
		 System.out.println("");
	 }
	 // interace methods will have void as return type.
	 /*
	  * we cannot create object for interface methods 
	  * Return type can vary
	  * Public return type  or just retun type r can only be used if not declared it will be taken as public abstract by default. 
	  * if just void is mentioned inside the class it will be taken as default
	  * for default and static we can have function body.
	  */
	 
}
