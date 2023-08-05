package pages;

import framework.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class RevieWalletHub extends CommonMethods {


	public RevieWalletHub(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public By fourthStar = By.xpath("(//review-star[@class='rvs-svg']//*[@class='rvs-star-svg'])[4]");

	public By categorydropdown=By.xpath("(//span[@class='dropdown-placeholder'])[2]");

	public By selectHI=By.xpath("//ul/*[contains(text(),'Health Insurance')]");

	public By writeYourReview=By.xpath("//div/textarea[starts-with(@class, 'textarea')]");

	public By submitBtn=By.xpath("//div[contains(text(),'Submit')]");

	public By continueBtn=By.xpath("//div[contains(text(),'Continue')]");

	public By confirmationmsg=By.xpath("//div[contains(text(),'you have reviewed the institution')]");











}
