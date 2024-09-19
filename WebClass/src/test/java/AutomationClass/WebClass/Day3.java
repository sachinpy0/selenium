package AutomationClass.WebClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.growwithanna-shop.com/");
		
		WebElement a1 = driver.findElement(By.linkText("WORKOUT PLANS"));
		a1.click();
				
		driver.findElement(By.name("ABOUT")).click();
		driver.close();
		
	}

}
