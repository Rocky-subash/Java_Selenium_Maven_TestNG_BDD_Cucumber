package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//launch the webpage
		driver.get("https://letcode.in/button");		
		WebElement ele = driver.findElement(By.className("card-content"));
		Thread.sleep(3000);
		File elescr = ele.getScreenshotAs(OutputType.FILE);
		File eledest = new File("./Snaps/img.png");
		FileHandler.copy(elescr, eledest);	
		//FileHandler.copy(elescr,eledest);
		
		driver.quit();		

	}

}
