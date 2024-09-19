package AutomationClass.WebClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

//		String myURL = "https://hstyles.co.uk/";
//		driver.get(myURL);
//
//		WebElement findobject = driver.findElement(By.xpath("//a[@id='tour-toggle']"));
//
//		driver.manage().timeouts().implicitlyWait(Duration.ZERO);
//
//		findobject.click();
//		System.out.println("click is done");

//		String myURL = "https://www.daraz.com.np/#?";
//		driver.get(myURL);
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Sign Up']")));
//		element1.click();

		String myURL = "https://hamrobazaar.com/signup";
		driver.get(myURL);
		
		driver.manage().window().maximize();

		try {
			WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
			fullname.sendKeys("Sachin");

			WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
			phone.sendKeys("8975511");

			WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			password.sendKeys("Kathmandu");

			WebElement check1 = driver.findElement(By.xpath("//label[@for='accept']"));
			check1.click();

			WebElement signup = driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Sign Up']"));
			signup.click();

		} catch (Exception e) {
			System.out.println("Locator couldn't be found");
		} finally {
			Thread.sleep(5000);
			driver.quit();
		}

	}

}
