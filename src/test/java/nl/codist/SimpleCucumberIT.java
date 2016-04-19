package nl.codist;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * This launches the tests. All tests in the same or a deeper package will be run.
 *
 * The cucumber options tell the runner to ignore all tests annotated with @skip
 * The ~ is the cucumber equivalent of !(not). If you want to run all tests with a given annotation,
 * pass that tag in the cucumber options
 */
@CucumberOptions(tags = "~@skip")
@RunWith(CucumberWithSerenity.class)
public class SimpleCucumberIT {
}