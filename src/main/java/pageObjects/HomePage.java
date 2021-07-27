package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//input[@class='search-keyword']");
	By searchbtn = By.xpath("//button[@class='search-button']");
	By productname = By.cssSelector("h4.product-name");
	By increamenticon = By.cssSelector("a.increment");
	By addtocartbtn = By.xpath("//div[@class='product-action']/button");
	By carticon = By.xpath("//a[@class='cart-icon']/img");
	By checkoutbtn = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	
	public WebElement getSearchBtn() {
		return driver.findElement(searchbtn);
	}
	
	public WebElement getProductname() {
		return driver.findElement(productname);
	}
	
	public WebElement getIncreament() {
		return driver.findElement(increamenticon);
	}
	
	public WebElement getAddtoCartBtn() {
		return driver.findElement(addtocartbtn);
	}
	
	public WebElement getcarticon() {
		return driver.findElement(carticon);
	}
	
	public WebElement getCheckoutBtn() {
		return driver.findElement(checkoutbtn);
	}

}
