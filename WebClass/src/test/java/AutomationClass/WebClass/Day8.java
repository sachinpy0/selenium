package AutomationClass.WebClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://easygenerator.com");
//
//		String url = "";
//
//		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
//		System.out.println("Total links in the page: " + allURLs.size());
//
//		Iterator<WebElement> iterator = allURLs.iterator();
//		while (iterator.hasNext()) {
//			url = iterator.next().getText();
//			System.out.println(url);
//		}

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links " + links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			verifyLinks(url);
		}
	}

	public static void verifyLinks(String LinkURL) {
		try {
			@SuppressWarnings("deprecation")
			URL url = new URL(LinkURL);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(LinkURL + "-" + httpURLConnect.getResponseMessage() + "is broken link");
			} else {
				System.out.println(LinkURL + "-" + httpURLConnect.getResponseMessage());
			}
		} catch (Exception e) {

		}

	}
}
