package testpage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Amazon_Homepage;

public class AmazonAdd_ToCart extends BaseTest {

	@Test(dataProvider = "productData")
	public void AddtoCart(String productName) {

		Amazon_Homepage homepage = new Amazon_Homepage(driver);
		

		homepage.searchbox(productName);

		String producttitile = homepage.Producttitile();

		homepage.AddtoCart();

		homepage.CartPage();

		String carttitile = homepage.productVerify();

		System.out.println("Product Title: " + producttitile);
		System.out.println("Cart Title: " + carttitile);

		
		
	//	Assert.assertTrue(producttitile.contains(carttitile), "Titile mismatch");
		
		System.out.println(" !!!!! Thanks for shopping with amazon!!!!!!!!! ");
		System.out.println("Im commiting new code");

	}

	@DataProvider(name = "productData")

	public Object[][] productData() {

		return new Object[][] {

				{ "Samsung FE" }

		};

	}

}
