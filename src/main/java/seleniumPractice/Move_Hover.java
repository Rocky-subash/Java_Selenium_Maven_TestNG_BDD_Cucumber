package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Hover {

	public static void main(String[] args) {
		
		/*
		 * Move hover
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@role ='button']")).click();
		WebElement ele =driver.findElement(By.xpath("//span[ text() = 'Login']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//div[text() ='My Profile']")).click();
		
		
		
		
		
		
		
		
		

	}

}
