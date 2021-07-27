package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	WebDriver driver;
	
	 @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page(){
		 /*System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");	 
			driver = new ChromeDriver();
			driver.get("https://sarasuat.excelindia.com/ISARAS/CL5/Login.aspx");
			driver.manage().window().maximize();*/
		 System.out.println("User is on Login page");
	    }

	 @When("^User login into application with username with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_with_something_and_password_something(String strArg1, String strArg2){
	     /*driver.findElement(By.xpath("//input[@name='txtName']")).sendKeys(strArg1);
	     driver.findElement(By.xpath("//input[@name='txtPwd']")).sendKeys(strArg2);
	     driver.findElement(By.id("SignIn")).click();*/
		 System.out.println("User "+strArg1+" logged in with "+strArg2);
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated(){
	        System.out.println("Homepage is populated");
	    }

	    @And("^Cards are displayed are \"([^\"]*)\"$")
	    public void cards_are_displayed_are_something(String strArg1){
	        System.out.println("Cards are validated "+strArg1);
	    }
	    
	    @Given("^User is on Register landing page$")
	    public void user_is_on_netbanking_landing_page_print(){
		 System.out.println("User is on Login page");
	    }

	    @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) {	     
		 List<List<String>> obj = data.asLists();
		 System.out.println(obj.get(0).get(0) +" | "+ obj.get(0).get(1) +" | "+ obj.get(0).get(2));
	    }

	    @Then("^page is populated$")
	    public void home_page_is_populated_print(){
	        System.out.println("Homepage is populated");
	    }

	    @And("^Card are displayed are \"([^\"]*)\"$")
	    public void cards_are_displayed_are_something_print(String strArg1){
	        System.out.println("Cards are validated "+strArg1);
	    }
	    
	    @When("^Users login into application with username with (.+) and password (.+)$")
	    public void user_login_into_application_with_username_with_and_password(String username, String password) throws Throwable {
	        System.out.println(username +" and "+ password);
	    }
	    
	    @Given("^Validate Browser$")
	    public void validate_browser() throws Throwable {
	        System.out.println("Initializing the chrome");
	    }

	    @When("^Brwoser is triggered$")
	    public void brwoser_is_triggered() throws Throwable {
	        System.out.println("Chrome is triggered");
	    }

	    @Then("^User launched the Application url$")
	    public void user_launched_the_application_url() throws Throwable {
	        System.out.println("User launched the chrome");
	    }


}
