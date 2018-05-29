package com.TestScripts;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.QA.objects.ObjectsandActions;

public class TestScripts {
	ObjectsandActions obj = new ObjectsandActions();

	
	 /* @Test void verifyTabs() {
	  Assert.assertTrue(obj.ElementFound(obj.getWomen()));
	  Assert.assertTrue(obj.ElementFound(obj.getTShirts()));
	  Assert.assertTrue(obj.ElementFound(obj.getDresses())); }
	  
	  @Test void navigation() { obj.getWomen().click();
	  Assert.assertTrue(obj.getWomenPage().getText().equalsIgnoreCase("Women"));
	  obj.getDresses().click(); Assert.assertTrue(obj.getDressesPage().getText().
	  contains("Find your favorites")); obj.getTShirts().click();
	  Assert.assertTrue(obj.gettshirtPage().getText().
	  contains("The must have of your")); }
	 */
	
	/*  @Test public void verifyoptions() { int i = 0; obj.getWomen().click();
	  ArrayList<String> expectedValues = new ArrayList<String>();
	  expectedValues.addAll(Arrays.asList("$16.51", "$27.00", "$26.00", "$50.99",
	  "$28.98", "$30.50", "$16.40")); List<WebElement> image
	  
	  for (WebElement image1 : obj.getImage(e)) {
	  
	  obj.getImage(image1);
	  
	  System.out.println(expectedValues.get(i) + "same" + actualValue);
	  Assert.assertTrue(actualValue.equals(expectedValues.get(i)));
	 
	  Assert.assertTrue(obj.getButton().get(i).isDisplayed());
	  Assert.assertTrue(obj.getMoreButtons().get(i).isDisplayed()); i = i + 1; } }
	*/ 
	
	 /* @Test public void newsLetter() { obj.setText(obj.getSubscription());
	  obj.getNewsButton().click();
	  Assert.assertTrue(obj.subscriptionMessage().isDisplayed()); }
	 */
	
	 /* @Test public void sortLowest() { int i=0; obj.getWomen().click();
	  obj.selectFromDropDown(obj.productSort(), "Price: Lowest first");
	  
	  ArrayList<String> expectedValues = new ArrayList<String>();
	  expectedValues.addAll(Arrays.asList("$16.40", "$16.51","$26.00", "$27.00",
	  "$28.98", "$30.50","$50.99")); List<WebElement> image = obj.getimageHover();
	  List<String> pricesorting = new ArrayList<String>(); for (WebElement image1 :
	  image) { obj.getImage(image1); pricesorting.add(obj.priceSort().get(i)); i++;
	  } Assert.assertSame(pricesorting, expectedValues); }
	 */

	@Test
	public void AddToCart() throws InterruptedException {
		obj.getWomen().click();
		ArrayList<WebElement> getButtons = (ArrayList<WebElement>) obj.getButton();
		for (int i = 0; i < obj.getimageHover().size(); i++) {
			obj.getImage(obj.getimageHover().get(i));
			Thread.sleep(1000);
			getButtons.get(i).click();
			Thread.sleep(1000);
			String previousPAgePrice = obj.previousPagePrice();
			obj.clickCloseOverlay();
			/*obj.AddToCart();
			String addedPrice = obj.addedProuct();
			Assert.assertEquals(previousPAgePrice, addedPrice);*/
		}
	}
}
