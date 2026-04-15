package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationCommands {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//launch the webpage
		driver.get("https://letcode.in/button");
		
		//get the current url and store it to current_url variable and print it  
		String current_url = driver.getCurrentUrl();
		System.out.println("Button Page URL "+ current_url);
		
		//now click on the go to home button
		driver.findElement(By.id("home")).click();
		
		//now the url of the home url and print it 
		String Home_url = driver.getCurrentUrl();
		System.out.println("Home url is "+Home_url );
		
		//now user have to press back button
		driver.navigate().back();
		String current_url_afterback = driver.getCurrentUrl();
		System.out.println("Button Page URL "+ current_url_afterback);
		
		Navigation nav  = driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		nav.to("");
		
		
		
				
				
				
		
		
		
	
		
		driver.quit();
		
		
		
		
		
		

	}

}
