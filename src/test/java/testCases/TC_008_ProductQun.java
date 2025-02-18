package testCases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.ProductQunPage;
import testBase.BaseClass;
import utilities.FileReaderUtil;

public class TC_008_ProductQun extends BaseClass {
	 private Map<String, String> expectedValues;
	 private ProductQunPage pqp;
	 
	 @BeforeClass
	    public void setupTest() {
	        expectedValues = FileReaderUtil.readExpectedValues("ExpectedResult/expected_values.txt"); // Load expected values
	        pqp = new ProductQunPage(driver);
	    }	
	@Test
	public void verify_productquentity(){
	// home page title verification	
	String actualTitle = driver.getTitle();
	String expectedTitle = expectedValues.get("PageTitle");
	Assert.assertEquals(actualTitle, expectedTitle,"Title is not matched");
	
	pqp.clickviewproduct();
	// Validating displaying productName
    String actualTitleName = pqp.productname();
    String expectedName = expectedValues.get("productName");
    pqp.removesetquentity();
    pqp.setquentity("4");
    pqp.clickaddtocart();
    pqp.clickviewcart();
    String actualQuentity = pqp.productqnt();
Assert.assertEquals(actualQuentity, "4", "Quentity is not matched" );    
	}
	
}
