package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.CommonMethods;

public class LoginFacebook extends CommonMethods {

	
	public LoginFacebook(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public By fieldEmail = By.name("email");
	public By fieldPassword = By.name("pass");
	public By buttonLogin = By.name("login");
	
	
	
	
	
	
	
	
}
