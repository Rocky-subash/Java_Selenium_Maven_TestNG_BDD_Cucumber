package testNgBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * Test NG Must not have Static key word in the main method declaration.
 * Return type must always be void ,if int string are mentioned we cannot run test ng 
 * It can have a method name but make sure the method name is not same as class name .
 * Can can run testNG using arguments , that is called data provider and parameter.
 * 
 * InvocationCount  is used to when user wants to run a method number of times.
 * InvocationTimeOut determines with in which time the method must execute, if it doesnnt execute within the given time test will be marked as fail.
 * 
 */

public class WindowHandling {
    @Test   //anotation 
	public void Window_Handling() {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://letcode.in/window");
		 
		 //first handle 
		 String FirstWindowHandle = driver.getWindowHandle();
		 System.out.println("First window: "+ FirstWindowHandle );
		 
		 
		 driver.findElement(By.id("home")).click(); 
		
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> windowHandleList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandleList.get(1));  // windowHandlesList.get(0)  will get the parent window ,  get(1) will get the new window.
		//switching to new window .
		System.out.println(driver.getCurrentUrl());
		
		
		//switch to parent window 
		driver.switchTo().window(windowHandleList.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		//switching to child window 
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println("windowHandle1 "+ windowHandles1);
		
		driver.switchTo().window(windowHandleList.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		 
		 
		 

	}

}
