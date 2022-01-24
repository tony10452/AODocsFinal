package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.driver.Base_properties;

public class landingPage {

public WebDriver driver;
	
	public landingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By googleAgree = By.id("L2AGLb");
	By searchField = By.xpath("//input[@class='gLFyf gsfi']");
	By AODocsLink = By.xpath("//h3[contains(text(),'AODocs: Cloud Native Document Management and Conte')]");
	
	
	public WebElement getGoogleAgree() {
		return driver.findElement(googleAgree);
	}
	
	public WebElement getSearchField() {
		return driver.findElement(searchField);
	}
	
	public WebElement getAODocsLink() {
		return driver.findElement(AODocsLink);
	}
	
	
}
