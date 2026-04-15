package testNgBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnParameter {
	
	void login() {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/login");
	driver.findElement(By.linkText("Log in ")).click();
	}

}
