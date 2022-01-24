package test;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PageObject.AODocsPage;
import PageObject.landingPage;
import selenium.driver.Base_properties;
import selenium.driver.Browser;
import selenium.driver.WebDriverUtility;

public class TestCases {


	static Base_properties b = new Base_properties();
	static WebDriver driver = WebDriverUtility.getWebDriver(Browser.CHROME);
	landingPage LP = new landingPage(driver);
	AODocsPage AP = new AODocsPage(driver);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@BeforeAll
	public static void beforeAll() throws IOException {
		driver.get(b.getURl());
	}
	
	@BeforeTest
	public void verifyProperties() throws IOException {
		assertEquals(b.getFirstName(), "Antoine");
		assertEquals(b.getLastName(), "");
		assertEquals(b.getEmailAdress(), "helloworld@mail.com");
		assertEquals(driver.getTitle(), "Google");
	}
	
	
	@Test
	public void testLandingPage() throws IOException {
		
		
		
		WebElement agreeGoogle = LP.getGoogleAgree();
		wait.until(ExpectedConditions.elementToBeClickable(agreeGoogle));
		agreeGoogle.click();
		
		WebElement searchField = LP.getSearchField();
		wait.until(ExpectedConditions.visibilityOf(searchField));
		searchField.sendKeys(b.getText());
		searchField.submit();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		WebElement AODocsLink = LP.getAODocsLink();
		AODocsLink.click();
		
	}
	
	@Test
	public void testAODocPage() throws IOException {
		
		WebElement AODocsAgree = AP.getAODocsAgree();
		wait.until(ExpectedConditions.elementToBeClickable(AODocsAgree));
		AODocsAgree.click();
		
		WebElement requestADemo = AP.getRequestDemo();
		wait.until(ExpectedConditions.elementToBeClickable(requestADemo));
		requestADemo.click();
		
		WebElement firstName = AP.getFirstName();
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys(b.getFirstName());
		
		WebElement lastName = AP.getLastName();
		wait.until(ExpectedConditions.visibilityOf(lastName));
		lastName.sendKeys(b.getLastName());
		
		WebElement emailAdress = AP.getEmailAdress();
		emailAdress.sendKeys(b.getEmailAdress());
		
		Select dropdown = new Select(AP.getCompanySize());
		dropdown.selectByIndex(2);
		
		
		
	}
	
	@AfterTest
	public void closeDriver() {
	driver.quit();
	}
	
}
