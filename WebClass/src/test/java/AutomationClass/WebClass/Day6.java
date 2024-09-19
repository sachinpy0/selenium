package AutomationClass.WebClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		String myURL = "https://ncell.com.np/en";
//		driver.get(myURL);
//
//		List<WebElement> elements = driver.findElements(By.id("mega"));
//
//		for (WebElement element : elements) {
//			System.out.println(element.getText());
//			
//		driver.get("https://hstyles.co.uk");
//
//		WebElement findtext = driver.findElement(By.xpath("//a[normalize-space()='Listen Here']"));
//		String actualtext = findtext.getText();
//		String expectedtext = "Listen Here";
//
//		if (actualtext.equalsIgnoreCase(expectedtext)) {
//			System.out.println("Correct Text");
//
//		} else {
//			System.out.println("Incorrect text");
//		}

		String myURL = "https://hstyles.co.uk";
		driver.get(myURL);

		WebElement mytext = driver.findElement(By.xpath("//p[@class='tagline']"));
		String actualtext = mytext.getText();
		String expectedtext = "Listen Here";

		if (actualtext.contains(expectedtext)) {
			System.out.println("Tagline is harry");
		} else {
			System.out.println("Tagline does not have harry");
		}
		System.out.println(actualtext.length());
		driver.quit();
	}
}
