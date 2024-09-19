package AutomationClass.WebClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10 {
	WebDriver driver;

	@Before
	public void Initalize() {
		driver = new ChromeDriver();

	}

	@Test
	public void testing() throws InterruptedException {
		driver.get("https://sachinpandey.com.np");
		System.out.println("opened webiste is" + driver.getCurrentUrl());

		driver.navigate().to("https://arianagrande.com");
		System.out.println("opened website is" + driver.getCurrentUrl());

		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("New website is" + driver.getCurrentUrl());

		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("New website is" + driver.getCurrentUrl());

	}

	@After
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}
}
