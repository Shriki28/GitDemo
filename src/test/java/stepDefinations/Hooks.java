package stepDefinations;

import cucumber.Base;
import io.cucumber.java.After;

public class Hooks extends Base{
	
	@After("@SeleniumTest")
	public void afterSeleniumtest() {
		driver.close();
	}

}
