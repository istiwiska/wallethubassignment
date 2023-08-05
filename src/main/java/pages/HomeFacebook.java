package pages;

import framework.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class HomeFacebook extends CommonMethods {


	public HomeFacebook(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public By spanRememberPassword = By.xpath("//span[contains(text(),'Remember Password')]");
	public By spanStatus = By.xpath("//span[contains(text(),\"What's on your mind, Camellia?\")]");
	public By buttonPost = By.xpath("//span[contains(text(),'Post')]");
	
	
	
	
	
	
	
	
}
