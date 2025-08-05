package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void Setup() {

		ChromeOptions option = new ChromeOptions();

		option.addArguments(
				"user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");

		driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/ref=nav_logo");

	}

	@AfterMethod
	public void teardown() {

		if (driver != null) {

			driver.quit();

		}

	}

}
