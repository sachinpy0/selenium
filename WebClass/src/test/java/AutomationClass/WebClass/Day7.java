package AutomationClass.WebClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter browser name: ");
//		String browser = sc.nextLine();
//		WebDriver driver = null;
//
//
//		if (browser.equalsIgnoreCase("IE")) {
//			driver = new InternetExplorerDriver();
//		} else if (browser.equalsIgnoreCase("Chrome")) {
//			driver = new ChromeDriver();
//
//		} else {
//			System.out.println("Invalid Browser");
//		}
//		Thread.sleep(2000);

//		driver.get("https://hstyles.co.uk");
//		driver.get(driver.getCurrentUrl());
//		driver.navigate();
		
		driver.get("https://hstyles.co.uk");
		String a1 = driver.getTitle();
		System.out.println(a1);
		
	
		
		try {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.F5).perform();
		} catch (Exception e) {
			System.out.println("Refresh is done");
		}
		
	}

}
