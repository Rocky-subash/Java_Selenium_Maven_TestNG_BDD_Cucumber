package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		//Implicit wait will affect only 2 methods , find element and find elements.
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/waits");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//wait for alert.
		driver.findElement(By.id("accept")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(until.getText());
		until.accept();		
		
		//Alert invisibility = wait.until(ExpectedConditions.invisibilityOf("Element")));
		driver.quit();		

	}

}
