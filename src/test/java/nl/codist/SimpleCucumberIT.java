package nl.codist;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(tags = "~@skip")
@RunWith(CucumberWithSerenity.class)
public class SimpleCucumberIT {
}