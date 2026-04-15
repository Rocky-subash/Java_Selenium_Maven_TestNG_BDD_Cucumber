package seleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	/*
	 * Test NG Must not have Static key word in the main method declaration.
	 * Return type must always be void   if int string are mentioned we cannot run test ng 
	 */
	
	
	
	public  void windowHandling()  {
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
