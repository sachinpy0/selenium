package AutomationClass.WebClass;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day11 {
	WebDriver driver;
	String baseURL;

	@Before
	public void Initialize() {
		driver = new ChromeDriver();
		baseURL = "https://www.holidify.com/";

	}

	@Test
	public void TestStart() throws InterruptedException {
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"currencyDropdown\"]"));
		Select sachin = new Select(element);
		sachin.selectByIndex(2);

		Thread.sleep(5000);
		sachin.selectByValue("durationHighLow");

		List<WebElement> options = sachin.getOptions();
		int size = options.size();

		for (int i = 0; i < size; i++) {
			char[] optionname1 = null;
			System.out.println(optionname1);
		}
	}

	@After
	public void TearDown() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();

	}

}
