package nl.codist;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoogleStepDefs {

    @Steps
    private GoogleSteps steps;

    @When("^I google for \"([^\"]*)\"$")
    public void iGoogleFor(String query) throws Throwable {
        steps.queryFor(query);
    }

    @Then("^I expect it to return results for \"([^\"]*)\"$")
    public void iExpectItToReturnResultsFor(String query) throws Throwable {
        Thread.sleep(500);
        assertTrue(steps.checkResults(query));
    }

    @Then("^I expect it to not return results for \"([^\"]*)\"$")
    public void iExpectItToNotReturnResultsFor(String query) throws Throwable {
        Thread.sleep(500);
        assertFalse(steps.checkResults(query));
    }
}
