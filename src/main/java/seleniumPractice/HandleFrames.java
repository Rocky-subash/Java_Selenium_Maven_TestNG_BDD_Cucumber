package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		/* WebElement Firstframe = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver .swithTo().frame(FirstFrame);
		*/
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("subash S");
		driver.findElement(By.name("lname")).sendKeys("s");
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame(); //to swithch to the prarent frame.
		/* if there are 3 frames 
		 * MP , F1 , F2
		 * IF the focus is in F2 and need to go to F1 use .parentFrame()
		 * If the focus is in F2 and need to go to the MP .defaultContent()
		 * 
		 * 
		 */
		
		
		
		driver.quit();




	}

}
