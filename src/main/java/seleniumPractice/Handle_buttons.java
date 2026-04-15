package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_buttons {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//launch the webpage
		driver.get("https://letcode.in/button");
		
		//Get the X an Y coordinates 
		WebElement Button_element= driver.findElement(By.id("position"));
		Point point = Button_element.getLocation();
		
		int x = point.getX();
		int y = point .getY();
		System.out.println("X => "+ x+"Y => "+y );
		
		//Find the color of the button
		WebElement btnColor = driver.findElement(By.xpath("//button[@id='color']"));
		String color = btnColor.getCssValue("background-color");
		System.out.println(color);
		
		//Find the Height and Width of the button 
		 Rectangle rect= driver.findElement(By.id("property")).getRect();
		 Dimension dime = rect.getDimension();
		 int x1_value = rect.getX();
		 int y1_Value = rect.getY();
		 System.out.println("X1 => "+ x1_value+" Y1 => "+ y1_Value );
		 
		 System.out.println("The dime values is "+dime);
		 System.out.println("The height of the button is "+dime.height);
		 System.out.println("The width of the button is "+dime.width);
		 		
		//Confirm button is disabled
		 boolean isDisabled = driver.findElement(By.id("isDisabled")).isDisplayed();
		 System.out.println(isDisabled); 
		 
		 driver.quit();

	}

}
