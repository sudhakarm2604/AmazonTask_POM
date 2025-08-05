package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.waitclass;

public class Amazon_Homepage extends waitclass {

	WebDriver driver;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(xpath = "//li[@id='p_123/46655']//i")
	WebElement checkbox;

	@FindBy(xpath = "//div[@role=\"listitem\"]")
	List<WebElement> products;

	@FindBy(xpath = ".//div[@data-cy='title-recipe']")
	WebElement titile;

	@FindBy(xpath = "//span[.=\"Samsung Galaxy S24 FE 5G AI Smartphone (Graphite, 8GB RAM, 128GB Storage)\"]")
	WebElement producttitle;

	@FindBy(xpath = "//span[.='Samsung Galaxy S24 FE 5G AI Smartphone (Graphite, 8GB RAM, 128GB Storage)']//following::button[@id='a-autoid-4-announce']")
	WebElement addcart;

	@FindBy(xpath = "//div[@id='nav-cart-count-container']")
	WebElement cartpage;

	@FindBy(xpath = "//h4[@class='a-text-normal']")
	WebElement verifyproduct;

	public Amazon_Homepage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void searchbox(String productname) {

		searchbox.sendKeys(productname + Keys.ENTER);

	}

	public void checkbox(WebElement element) {

		waituntilclickable(checkbox);
		checkbox.click();

	}

	public String getProductTitile(WebElement product) {

		try {

			return product.findElement(By.xpath(".//div[@data-cy='title-recipe']")).getText();

		} catch (Exception e) {

		}
		return null;

	}

	public void listProductTitles(int maxCount) {

		int count = 0;

		for (WebElement product : products) {

			String titile = getProductTitile(product);

			if (titile != null) {

				System.out.println(titile);

			} else {

				System.out.println("Title not found for the product");

			}

			count++;
			if (count > maxCount)
				break;

		}

	}

	public String Producttitile() {

		return producttitle.getText();

	}

	public void AddtoCart() {

		waituntilvisible(addcart);

		addcart.click();

	}

	public void CartPage() {

		waituntilvisible(cartpage);

		cartpage.click();

	}

	public String productVerify() {

		return verifyproduct.getText();

	}

}
