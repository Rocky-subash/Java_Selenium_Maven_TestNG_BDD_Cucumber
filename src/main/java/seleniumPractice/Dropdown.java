package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//fruits Sigle option select drop down
		WebElement fruits_Dropdown = driver.findElement(By.id("fruits"));
		Select fruits = new Select(fruits_Dropdown);
		fruits.selectByVisibleText("Apple");
		fruits.selectByVisibleText("Mango");
		WebElement fruit_sucess_message = driver.findElement(By.xpath("//div/p[@class='subtitle']"));
		System.out.println(fruit_sucess_message.getText());
		
		//Super heros multiple option select 
		
		WebElement super_heros = driver.findElement(By.id("superheros"));
	
		Select hero_name = new Select(super_heros);
		/*List <WebElement> alloptions = hero_name.getAllSelectedOptions();
		for (WebElement option : alloptions) {
			if( option.getText() == "Thor"){
					
			}*/
		hero_name.selectByContainsVisibleText("Thor");	
		hero_name.selectByContainsVisibleText("Aquaman");		
		hero_name.selectByContainsVisibleText("Batman");
		
		//checking if it is multiple selected 
		Boolean multipleselected = hero_name.isMultiple();
		System.out.println("have we selected multiple options in the drop down "+multipleselected);
		
	List <WebElement> all_hero_option = hero_name.getAllSelectedOptions();
	for (WebElement hero: all_hero_option) {
		System.out.println("option"+ hero.getText());
	}
	
	//select the language from drop down
	
	WebElement Programming_language = driver.findElement(By.id("lang"));
	Select language = new Select(Programming_language);
	language.selectByVisibleText("Python");
	WebElement language_successmessage = driver.findElement(By.xpath("(//p[@class='subtitle'])[1]"));
	System.out.println("The selected Language is "+language_successmessage.getText());
	
	//select the country from drop down.
	
	WebElement country_list = driver.findElement(By.xpath("//div/select[@id ='country']"));
	Select country = new Select(country_list);
	country.selectByValue("India");
	
	WebElement selected_country = country.getFirstSelectedOption();

	System.out.println("The selected country is "+ selected_country.getText());
	driver.quit();
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
