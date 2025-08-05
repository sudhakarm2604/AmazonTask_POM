package testpage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Amazon_Homepage;

public class AmazonFiltertTest extends BaseTest {

	@Test(dataProvider = "productData")
	public void testAmazon(String productname) {

		Amazon_Homepage homepage = new Amazon_Homepage(driver);

		homepage.searchbox(productname);

		homepage.checkbox(null);

		homepage.listProductTitles(5);

		String titile = homepage.getProductTitile(null);

		System.out.println("\n Product Titile " + titile);

	}

	@DataProvider(name = "productData")
	public Object[][] productData() {

		return new Object[][] { { "samsung" } };

	}

}
