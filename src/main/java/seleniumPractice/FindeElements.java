package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindeElements {

	public static void main(String[] args) {
		
		//Find elements must have a implicit wait 
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/edit");
		List<WebElement> elements = driver.findElements(By.className("label"));
		for (WebElement label : elements) {
			String text = label.getText();
			
			System.out.println(text);			
		}
		
		if(elements.size() == 6) {
			System.out.println("Test case passed");
		}
		
		Actions actions = new Actions(driver);
		driver .get("https://www.google.com/");
		driver.findElement(By.tagName("textarea")).sendKeys("cricket");
		actions.sendKeys(Keys.ENTER).build().perform();
		
		List <WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'Cricket') or contains(text() ,'cricket')]"));
		System.out.println("no of cricket terms: " + cricket.size());
		driver.quit();
		
		

	}

}
