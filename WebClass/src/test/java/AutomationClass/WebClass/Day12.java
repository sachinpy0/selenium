package AutomationClass.WebClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class Day12 {
	WebDriver driver;

	@Before
	public void InitalizeTest() {
		driver = new ChromeDriver();
	}

	@Test
	public void TestStart() {
		driver.get("https://hstyles.co.uk");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(screenshot, new File("C:/Users/sachin/Desktop/screenshot.png"));
			System.out.println("Screenshot saved successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@After
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
