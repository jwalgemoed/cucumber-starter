package nl.sourcelabs.google;

import nl.sourcelabs.TestContext;
import org.fluentlenium.core.annotation.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

/**
 * Steps class, containing the actual logic for the tests. The annotations are to allow Serenity to initialize spring.
 */
@ContextConfiguration(classes = TestContext.class)
@TestPropertySource({"classpath:serenity.properties"})
public class GoogleSteps {

    // Serenity injects the page object for interaction with pages
    @Page
    private GooglePage googlePage;

    // Test implementations
    public void queryFor(final String query){
        googlePage.open();
        googlePage.typeQuery(query);
        googlePage.search();
    }

    public boolean checkResults(final String query) {
        return googlePage.checkTitleContains(query);
    }
}
