package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWinodw {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		/*The above line works as below internally, this is chaining concept.
		 * Options opt = driver.manage();
		Window win = opt.window();
		win.maximize(); 
		*/
	}

}
