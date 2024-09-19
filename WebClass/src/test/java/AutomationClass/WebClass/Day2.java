package AutomationClass.WebClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Day2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/member.daraz.com.np/user/login");
		WebElement username = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div/div[2]/div/input"));
		username.sendKeys("8956503023");
		WebElement password = driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div/div[3]/div[1]/input"));
		password.sendKeys("hkdfhja=28+-");
		WebElement login = driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div/div[4]/button"));
		login.sendKeys("hkdfhja=28+-");
		System.out.println("Click is succesful");

	}

}
