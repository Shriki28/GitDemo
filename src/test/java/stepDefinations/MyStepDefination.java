package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefination {
	
	WebDriver driver;
	HomePage hp;
	CheckoutPage cp;
	
	@Given("^User is on GreenKart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
		driver = Base.getDriver();
       
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable { 	
    	hp = new HomePage(driver);
    	hp.getSearch().sendKeys(strArg1);
    	hp.getSearchBtn().click();
       Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {    	
        Assert.assertTrue(hp.getProductname().getText().contains(strArg1));
    }
    
    @Then("^Verify selected (.+) items are displayed in checkout page$")
    public void verify_selected_items_are_displayed_in_checkout_page(String vegetablename) throws Throwable{
    	cp = new CheckoutPage(driver);
        Assert.assertTrue(cp.getProductname().getText().contains(vegetablename));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	hp = new HomePage(driver);
       hp.getIncreament().click();
       hp.getAddtoCartBtn().click();
    }

    @And("^User proceeded to checkout page to purchase$")
    public void user_proceeded_to_checkout_page_to_purchase() throws Throwable {
    	hp = new HomePage(driver);
        hp.getcarticon().click();
        hp.getCheckoutBtn().click();
    }
    

}
