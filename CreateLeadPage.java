package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class CreateLeadPage extends BaseHooks {
	
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public CreateLeadPage enterCompany() {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		return this;

	}

	public CreateLeadPage enterFirstName() {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathya");
		return this;
	}

	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		return this;
	}

	public CreateLeadPage phoneNumeber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("425");
		return this;
	}

	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

		return new ViewLeadPage(driver);
	}
}
