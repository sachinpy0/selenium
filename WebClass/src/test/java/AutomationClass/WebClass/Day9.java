package AutomationClass.WebClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9 {
	WebDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
	}

	@Test
	public void testURL() {
		driver.get("https://hstyles.co.uk");
		String a1 = driver.getTitle();
		System.out.println(a1);
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
