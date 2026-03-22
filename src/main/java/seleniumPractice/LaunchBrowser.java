package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("Webdriver.chrome.driver",driver path )
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.findElement(By.linkText(null);
		
		//Append a text and press keyboard TAB key 
		driver.findElement(By.id("")).sendKeys("Name",Keys.TAB);
		
		//What is inside the text box 		
		String myValue = driver.findElement(By.id("")).getAttribute("value");
		System.out.println(myValue);
		
		//clear 
		driver.findElement(By.linkText("")).clear();
		
		//Confirm is disable
		
		driver.findElement(By.xpath("")).isDisplayed();
		
		//Confirm is read only
		String readOnly= driver.findElement(By.id("")).getAttribute("ReadOnly");
		System.out.println(readOnly);
		//will return true or false.
		
		/*Locators
		 * ID
		 * Name
		 * Class Name
		 * Tag Name
		 * Link Text 
		 * Partial Link Text 
		 * CSS Selector 
		 * XPATH 		  
		*/

	}

}

