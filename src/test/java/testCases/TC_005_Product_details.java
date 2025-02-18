package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.ProductDetailsPage;
import testBase.BaseClass;

public class TC_005_Product_details extends BaseClass {
	@Test
	public void Verify_Product_Details() {
		HomePage hp = new HomePage(driver);
		hp.clickproducts();
        ProductDetailsPage pp = new ProductDetailsPage(driver);
        pp.clickviewproduct();
        validateText("product",pp.isAllProductDisplayed(),"Text Mismatched");
        validateText("prod_nm",pp.isproductnameDisplayed(),"Text Mismatched");

        validateText("price",pp.isproductnameDisplayed(),"price Mismatched");
        validateText("Polo",pp.isproductnameDisplayed(),"brand Mismatched");

	}

}
