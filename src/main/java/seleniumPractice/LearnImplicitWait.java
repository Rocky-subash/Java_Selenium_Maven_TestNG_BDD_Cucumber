package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Log in ")).click();
		
		driver.findElement(By.name("ema")).sendKeys("Koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		
		
		/* 
		 

// 1. Implicit Wait - Wait for ALL elements
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// 2. Page Load Timeout - Wait for page to load
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

// 3. Script Timeout - Wait for JavaScript to execute
driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));*/
	}

}
