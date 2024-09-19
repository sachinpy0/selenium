package AutomationClass.WebClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String myURL = "https://www.daraz.com.np/#?";

		driver.get(myURL);
		WebElement location = driver.findElement(By.xpath("//div[@id='J_FlashSale']"));

		Actions sachin = new Actions(driver);
		sachin.dragAndDropBy(location, 10, 0);
		System.out.println("Right click");

	}

}
