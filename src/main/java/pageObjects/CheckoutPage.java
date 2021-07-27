package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By Productname = By.xpath("//p[@class='product-name']");
	
	public WebElement getProductname() {
		return driver.findElement(Productname);
	}

}
