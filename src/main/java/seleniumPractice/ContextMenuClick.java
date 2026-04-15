package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		WebElement ele = driver.findElement(By.id(""));
		Actions actions = new Actions(driver);
		actions.contextClick(ele).perform();
		
		
		

	}

}
