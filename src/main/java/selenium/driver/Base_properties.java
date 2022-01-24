package selenium.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ressources.data;

public class Base_properties {

	public static Properties prop = new Properties();
	data d = new data();
	
	public String getURl() throws IOException {
		
	/*	FileInputStream fis = new FileInputStream("C:\\Users\\Antoine\\Desktop\\AODocs\\aodocs-selenium-techtest-main3\\src\\main\\java\\ressources\\data.properties");
		prop.load(fis);
		String url = prop.getProperty("url");*/
		String url = d.getUrl();
		return url;
	}
	
	public String getText() throws IOException {

		/*FileInputStream fis = new FileInputStream("C:\\Users\\Antoine\\Desktop\\AODocs\\aodocs-selenium-techtest-main3\\src\\main\\java\\ressources\\data.properties");
		prop.load(fis);
		String text = prop.getProperty("text");*/
		String text = d.getText();
		return text;
		
	}
	
	public String getFirstName() throws IOException {
		/*FileInputStream fis = new FileInputStream("C:\\Users\\Antoine\\Desktop\\AODocs\\aodocs-selenium-techtest-main3\\src\\main\\java\\ressources\\data.properties");
		prop.load(fis);
		String firstName = prop.getProperty("firstName");*/
		String firstName = d.getFirstName();
		return firstName;
	}
	
	public String getLastName() throws IOException {
		/*FileInputStream fis = new FileInputStream("C:\\Users\\Antoine\\Desktop\\AODocs\\aodocs-selenium-techtest-main3\\src\\main\\java\\ressources\\data.properties");
		prop.load(fis);
		String lastName = prop.getProperty("lastName");*/
		String lastName = d.getLastName();
		return lastName;
	}
	
	public String getEmailAdress() throws IOException {
		/*FileInputStream fis = new FileInputStream("C:\\Users\\Antoine\\Desktop\\AODocs\\aodocs-selenium-techtest-main3\\src\\main\\java\\ressources\\data.properties");
		prop.load(fis);
		String emailAdress = prop.getProperty("emailAdress");*/
		String emailAdress = d.getEmail();
		return emailAdress;
	}
	
}
