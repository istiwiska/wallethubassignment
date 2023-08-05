package pages;

import framework.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginWalletHub extends CommonMethods {


	public LoginWalletHub(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public By fieldEmail = By.cssSelector("#email");
	public By fieldPassword = By.cssSelector("#password");
	public By buttonLogin = By.xpath("//button[@class=\"btn blue center reg-tabs-bt touch-element-cl\"]");
	
	
	
	
	
	
	
	
}
