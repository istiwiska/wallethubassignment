package logic;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.CreateSession;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomeFacebook;
import pages.LoginFacebook;

import java.io.IOException;

public class HomePageHelper  {

	LoginFacebook loginFacebook;
	HomeFacebook homeFacebook;
	WebDriver driver ;


	public HomePageHelper() throws IOException{
		driver = CreateSession.getWebDriver();
		loginFacebook = new LoginFacebook(driver);
		homeFacebook = new HomeFacebook(driver);
	}

	@Given("^user is on facebook page \"([^\"]*)\"$")
	public void user_is_on_facebook_page(String url){
		loginFacebook.get(url);
	}

	@And("^user entered valid userName or phoneNumber as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_entered_valid_username_phone_number_and_password(String usename,String password) throws Throwable {
		loginFacebook.waitForPageToLoad(loginFacebook.getTitle());
		loginFacebook.waitForVisibility(loginFacebook.fieldEmail);
		loginFacebook.findElement(loginFacebook.fieldEmail).sendKeys(usename);
		loginFacebook.waitForVisibility(loginFacebook.fieldPassword);
		loginFacebook.findElement(loginFacebook.fieldPassword).sendKeys(password);
	}


	@When("^user click on login button$")
	public void user_click_on_login_button(){
		loginFacebook.waitForElementToBeClickable(loginFacebook.buttonLogin);
		loginFacebook.clickOnElementUsingJs(loginFacebook.buttonLogin);
	}

	@Then("^render home page$")
	public void render_home_page() throws Throwable {
		homeFacebook.waitForVisibility(homeFacebook.spanRememberPassword);
		Thread.sleep(2000);
		homeFacebook.clickOnElementUsingActions(homeFacebook.spanRememberPassword);
	}

	@And("^user create status as \"([^\"]*)\"$")
	public void create_status(String status) throws Throwable {
		homeFacebook.waitForVisibility(homeFacebook.spanStatus);
		homeFacebook.clickOnElementUsingJs(homeFacebook.spanStatus);
		Thread.sleep(3000);
		WebElement activepostarea = driver.switchTo().activeElement();
		activepostarea.sendKeys(status);
	}

	@When("^user click post button$")
	public void user_click_post_button() throws Throwable {
		homeFacebook.waitForElementToBeClickable(homeFacebook.buttonPost);
		homeFacebook.clickOnElementUsingJs(homeFacebook.buttonPost);
		Thread.sleep(2000);
	}
}
