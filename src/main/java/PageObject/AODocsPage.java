package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AODocsPage {
	
	public WebDriver driver;

	public AODocsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By AODocsAgree = By.xpath("//div[@class='ccc-notify-buttons']/button[@id='ccc-notify-accept']");
	By requestDemo = By.linkText("Request a demo");
	By firstName = By.xpath("//div[@class='input']/input[@name='firstname']");
	By lastName = By.xpath("//div[@class='input']/input[@name='lastname']");
	By emailAdress = By.xpath("//div[@class='input']/input[@name='email']");
	By companySize = By.xpath("//div[@class='input']/select[@name='company_size__c']");
	
	
	public WebElement getAODocsAgree() {
		return driver.findElement(AODocsAgree);
	}
	
	public WebElement getRequestDemo() {
		return driver.findElement(requestDemo);
	}
	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement getEmailAdress() {
		return driver.findElement(emailAdress);
	}
	
	public WebElement getCompanySize() {
		return driver.findElement(companySize);
	}
	
	
	
}
