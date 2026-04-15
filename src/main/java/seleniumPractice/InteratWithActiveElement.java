package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteratWithActiveElement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement active =driver.switchTo().activeElement();
		active.sendKeys("email",Keys.TAB,"password",Keys.ENTER);
		driver.quit();
		
		
		
		
		
		
		

	}

}
