package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefinition {
	
	WebDriver driver;

	@Given("^user is already on login page$")
	
	public void user_already_login_page() {
	
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ranjith\\eclipse-workspace\\Cucumber\\lib\\ChromeDriver\\chromedriver.exe");
        
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
	
	}
	
	@When("^title of the page is Free CRM $")
	
	public void title_page_FreeCRM() {
		
		String title=driver.getTitle();
		
		System.out.println("title");
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", "title");
		
	}
	
	
	@Then("^user enters username and password $")
	
	public void username_password() {
		
		driver.findElement(By.id("userid")).sendKeys("Seshadrivasam");
		driver.findElement(By.id("pass")).sendKeys("Gayi3@sdv");
		
	}
	
	@Then("^user clicks on login button $")
	
	public void clicks_login_button() {
		
		WebElement loginbtn=driver.findElement(By.id("sgnBt"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginbtn);
		
	}
	
}
