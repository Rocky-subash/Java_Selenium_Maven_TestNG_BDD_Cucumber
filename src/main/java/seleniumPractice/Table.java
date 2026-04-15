package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// Got to the table 
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement Table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = Table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			System.out.println(header.getText());			
		}
		
		List<WebElement> allrows = Table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		for (WebElement row : allrows) {
			System.out.println(row.getText());
			
			List<WebElement> columns = row.findElements(By.tagName("td"));
			//System.out.println("Columns "+columns);
			
			
			WebElement firstcolumn = columns.get(0);
			System.out.println(firstcolumn.getText());				
		}
		
		for (int i = 0; i<size;i++) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(1);
			String text = lastname.getText();
			
			if(text.equals("Chatterjee")){
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
				
			}
			
			
			
			
		}
		
		
		
		
		
		driver.quit();
		

	}

}
