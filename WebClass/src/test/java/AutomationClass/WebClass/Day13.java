package AutomationClass.WebClass;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13 {
	WebDriver driver;
	String baseURL;

	@Before
	public void InitalizeTest() {
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("C:/Users/sachin/AppData/Local/Google/Chrome/User Data");
//		option.addArguments("profile-directory=Profile 3");
		driver = new ChromeDriver();
	}

	@Test
	public void TestStart() throws InterruptedException {
//		baseURL = "https://hstyles.co.uk";
//		driver.get(baseURL);
//		WebElement element = driver.findElement(By.xpath("//section[@id='lnt-detail']"));
//		String attrib = element.getAttribute("name");
//		System.out.println(attrib);

		driver.get("https://pastpapers.papacambridge.com/");
		Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
		System.out.println("Getting all cookies");

		for (org.openqa.selenium.Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "--->" + cookie.getValue());
		}

		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		System.out.println("Cookies deleted");
		Thread.sleep(5000);
		System.out.println("Getting new Cookies ");

		for (org.openqa.selenium.Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "--->" + cookie.getValue());
		}
	}

	@After
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
