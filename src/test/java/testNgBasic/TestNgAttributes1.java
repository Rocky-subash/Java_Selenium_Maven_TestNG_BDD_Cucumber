package testNgBasic;

import java.util.NoSuchElementException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgAttributes1 {
	
	/*
	 * Attribute : priority
	 * 
	 * priority is the attibute set to determine the execution order of program.
	 * if prority is mentioned as -5 or -100 it will be executed first 
	 * if priority is not set then method will be execueted by ordering the method name in ASCIE format
	 * 
	 * Attribute: dependsOnMethods
	 * 
	 * depends on method , the next method will be executed if the name of the method name which is given as value is executed first.
	 * dependsOnMethod takes precedence on priority.
	 * 
	 * if depends on is mentioned for a method and the method it depends is on other package or class name 
	 * we have to give the value as "Package name.classname.method name"
	 * 
	 * Attribute: InvocationCount :
	 * 
	 *  InvocationCount  is used to when user wants to run a method number of times.
	 *  
	 *Attribute : InvocationcountTimeout 
     * InvocationTimeOut determines with in which time the method must execute, if it doesnnt execute within the given time test will be marked as fail.
     *  invocation timeout will only work if we have declared invovation count attrubute.
	 * same as thread count only works if we have declared parallel .
	 * 
	 * 
	 * Attribute : Always run , enable , description
	 *  
	 *  Alwaysrun:
	 *  
	 *  Always run is used to make sure the method runs always though its dependency fails, the defalut value is false we have to change it to true .
	 *  
	 *  enable: 
	 *  Enable is used to skip a test by setting the attribute value to false , default value is true .
	 *  "enable" takes precedence over "Alwaysrun 
	 *  
	 *  Description :
	 *  description is used to give descritpion for the test .
	 * 
	 *  ThreadPoolSize , TimeOut ,ExpectedException 
	 *  
	 * ThreadPoolSize:
	 * It will work only if invocation count is present . usually invocation count runs program sequencially, thread pool size runs program parallely.
	 * 
	 * Timeout :
	 * If we want to specify how long this test should run , we use time out attribute.
	 * if test fails we will get test "Thread timeout exception".
	 * 
	 * ExceptedException:
	 * IF a test fails we will get a exception 
	 * if we know a test will get failed because of a expection and we have to still pass the test case we use ExpectedException attribute.
	 * 
	 * Groups :
	 * It is used to run test in groups for eg for sanity , smoke.
	 * <groups>
 	<run>
 			<!--  exclude takes more precedence than include -->
	 <include name="smoke"></include>
	 <exclude name="reg"></exclude>
 	</run>
 	</groups>
	 * 
	 * if anything mentioned with @ then it annotation , if a keyword is mentioned inside the annotation is called attribute.
	 * 
	 * prameters :
	 * 
	 * there are two types of test data one is 
	 * static test data , dynamic test data.
	 * always run from XMl file 
	 * <parameter name="email" value="kaushick350@gamail.com"></parameter>
	 * 
	 * 
	 *   
	 */
	@Parameters({"email","password","browser"})
	@Test(priority = 1,enabled = true, alwaysRun = true,description = "This test will do the signup process",expectedExceptions = {NoSuchElementException.class},groups = {"smoke"})
	public void signUp(String email,String password ,String browser) {
		RemoteWebDriver driver;
		switch(browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver ();
			break;
		default:
			System.err.println("browser is not defined");
			break;
					
		}
		System.out.println(email + password );
		System.out.println("signup");
	}
	
	@Test(priority = 2, dependsOnMethods = "signUp",invocationCount = 2,invocationTimeOut = 20000,threadPoolSize = 2,groups = {"reg"})
	public void login() {
		System.err.println("login");		
	}
	
	@Test(priority = 3,dependsOnMethods ="login",groups = {"sanity"} )
	public void searchProduct() {
		System.out.println("Search product");
	}
	
	@Test(priority = 4,dependsOnMethods = "searchProduct",groups={"smoke"})
	public void addtoCart() {
		System.out.println("add to cart");
	}
	
	@Test(priority = 5,dependsOnMethods ="addtoCart",timeOut = 4000,groups = {"reg","smoke","sanity"})
	public void signOut() {
		System.out.println("signout");
	}
	

}
