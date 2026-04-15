package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//launch the webpage
		driver.get("https://letcode.in/alert");
		
		//click on simple alert
		/*
		driver.findElement(By.id("accept")).click();		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(" The text inside the simple alert is "+ text);
		alert.accept(); */
		
		//confirm alert 
		
		/*driver.findElement(By.id("confirm")).click();
		Alert Confirm_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String Confirm_alert_text = Confirm_alert.getText();
		System.out.println("The text inside confirm alert is " + Confirm_alert_text);
		alert.accept();
		driver.findElement(By.id("confirm"));
		Thread.sleep(2000);
		Alert Confirm_alert_dismiss = driver.switchTo().alert();
		Confirm_alert_dismiss.dismiss();	*/
		
		//promt alert 
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("subash");
		driver.switchTo().alert().accept();
		WebElement ele=driver.findElement(By.id("myName"));
		String promt_text = ele.getText();
		System.out.println(promt_text);	
		driver.quit();
		
	}

}
