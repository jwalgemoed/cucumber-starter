package nl.sourcelabs.google;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Step definition class. Glue code between the feature files (the annotations relate to steps in the features)
 *
 * These should be optimized for re-use. The steps class is a class injected by Serenity - the idea behind is to
 * separate the glue code from the actual logic. This should make re-use a lot more convenient.
 */
public class GoogleStepDefs {

    // Injected by Serenity
    @Steps
    private GoogleSteps steps;

    // Step definitions used in the tests. In Intellij with the cucumber plugin you can command-click from the features
    // to the implementations.
    @When("^I google for \"([^\"]*)\"$")
    public void iGoogleFor(String query) throws Throwable {
        steps.queryFor(query);
    }

    @Then("^I expect it to return results for \"([^\"]*)\"$")
    public void iExpectItToReturnResultsFor(String query) throws Throwable {
        Thread.sleep(1000);
        assertTrue(steps.checkResults(query));
    }

    @Then("^I expect it to not return results for \"([^\"]*)\"$")
    public void iExpectItToNotReturnResultsFor(String query) throws Throwable {
        Thread.sleep(1000);
        assertFalse(steps.checkResults(query));
    }
}
