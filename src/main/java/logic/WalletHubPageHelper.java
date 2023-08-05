package logic;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.CreateSession;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;

import java.io.IOException;
import java.util.List;

public class WalletHubPageHelper {

	LoginWalletHub loginWalletHub;
	RevieWalletHub revieWalletHub;

	WebDriver driver ;


	public WalletHubPageHelper() throws IOException{
		driver = CreateSession.getWebDriver();
		loginWalletHub = new LoginWalletHub(driver);
		revieWalletHub = new RevieWalletHub(driver);
	}

	@Given("^user is on wallet hub page \"([^\"]*)\"$")
	public void user_is_on_wallet_hub_page(String url) throws Throwable {
		loginWalletHub.get(url);
	}

	@And("^user entered valid email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_entered_valid_email_and_password(String email,String password) throws Throwable {
		loginWalletHub.waitForPageToLoad(loginWalletHub.getTitle());
		loginWalletHub.waitForVisibility(loginWalletHub.fieldEmail);
		loginWalletHub.findElement(loginWalletHub.fieldEmail).sendKeys(email);
		loginWalletHub.waitForVisibility(loginWalletHub.fieldPassword);
		loginWalletHub.findElement(loginWalletHub.fieldPassword).sendKeys(password);
	}


	@When("^user click on login button wallet hub$")
	public void user_click_on_login_button() throws Throwable {
		loginWalletHub.waitForElementToBeClickable(loginWalletHub.buttonLogin);
		loginWalletHub.clickOnElement(loginWalletHub.buttonLogin);
	}

	@Then("^user click fourth star for rating$")
	public void user_click_fourth_star() throws Throwable {
		Thread.sleep(5000);
		revieWalletHub.waitForVisibility(revieWalletHub.fourthStar);
		Actions action=new Actions(driver);
		for (int i=1; i<=4;i++) {
			Thread.sleep(2000);
			action.moveToElement(driver.findElement(By.xpath("(//review-star[@class='rvs-svg']//*[@class='rvs-star-svg'])["+i+"]"))).build().perform();

		}
		revieWalletHub.clickOnElement(revieWalletHub.fourthStar);
		Thread.sleep(1000);
	}

	@And("^user choose Health Insurance$")
	public void user_choose_health_insurances() throws Throwable {
		revieWalletHub.clickOnElement(revieWalletHub.categorydropdown);
		Thread.sleep(1000);
		revieWalletHub.clickOnElement(revieWalletHub.selectHI);
	}

	@And("^user type the review$")
	public void user_type_the_reviews() throws Throwable {
		revieWalletHub.findElement(revieWalletHub.writeYourReview).sendKeys("Health Insurance is a kind of insurance that provides coverage for medical expenses "
				+ "to the policy holder. Depending on the health insurance plan chosen the policy holder can get coverage "
				+ "for critical illness expenses, surgical expenses, hospital expenses etc.");
	}

	@Then("^user click submit button$")
	public void user_click_submit_button() throws Throwable {
		revieWalletHub.clickOnElement(revieWalletHub.submitBtn);
		Thread.sleep(10000);
		revieWalletHub.waitForVisibility(revieWalletHub.continueBtn);
		revieWalletHub.clickOnElement(revieWalletHub.continueBtn);
		Thread.sleep(3000);
	}



}
