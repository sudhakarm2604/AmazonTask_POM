package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitclass {

	WebDriver driver;

	WebDriverWait wait;

	public waitclass(WebDriver driver) {

		this.driver = driver;

		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public void waituntilvisible(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void waituntilclickable(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

}
