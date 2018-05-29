package com.QA.objects;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	static WebDriver driver;
	public String browser = "chrome";
	String parentWindow;

	public ReusableMethods() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "E:\\\\Selenium\\\\chromedriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
			parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
		}
	}

	public boolean ElementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
			System.out.println(res);
		} catch (Exception e) {
			return false;
		}
		return res;
	}

	public WebElement getImage(WebElement e) {
		Actions obj = new Actions(driver);
		obj.moveToElement(e).build().perform();
		return e;
	}

	public void setText(WebElement element) {
		element.sendKeys("krithi@gmail.com");
	}

	public String selectFromDropDown(WebElement element, String option) {
		Select obj = new Select(element);
		obj.selectByVisibleText(option);
		return obj.getFirstSelectedOption().getText();
	}

	public void wait(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOf(element));
	}
}