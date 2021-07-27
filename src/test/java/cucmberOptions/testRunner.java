package cucmberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinations",stepNotifications = true,tags="@SeleniumTest1",
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucmber.xml"})
public class testRunner {

}
