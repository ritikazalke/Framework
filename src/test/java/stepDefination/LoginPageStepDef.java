package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDef {
	WebDriver driver;

	//we have to convert each line in feature file

	//to a method 
	@Given("^User is on Login Page$")
    public void user_is_on_login_page() throws Throwable {
        
    }

    @When("^User enters username as  (.+)$")
    public void user_enters_username_as(String username) throws Throwable {
        
    }

    @Then("^User should be logged in successfully$")
    public void user_should_be_logged_in_successfully() throws Throwable {
        
    }

    @And("^User enters password as (.+)$")
    public void user_enters_password_as(String password) throws Throwable {
        
    }

	@Given("User is on Login Page")

	public void user_is_on_Login_Page() {

		WebDriverManager.chromedriver().setup();

		driver=  new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enter correct username")
	public void user_enter_correct_username() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	}
	@When("User enter correct password")
	public void user_enter_correct_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");;
		

	}

	@Then("User should be logged in sucessfully")
	public void user_should_be_logged_in_sucessfully() {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
		
	}


	@When("User enters incorrect username")

	public void user_enters_incorrect_username() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin_test");
	}
	@When("User enters incorrect password")

	public void user_enters_incorrect_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123_test");
	}
	@Then("User should not be allowed to logged in")

	public void user_should_not_be_allowed_to_logged_in() {

		driver.quit();
	}
}
