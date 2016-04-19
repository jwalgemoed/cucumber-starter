package nl.codist;

import org.fluentlenium.core.annotation.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@ContextConfiguration(classes = TestContext.class)
@TestPropertySource({"classpath:serenity.properties"})
public class GoogleSteps {

    @Page
    private GooglePage googlePage;

    public void queryFor(final String query){
        googlePage.open();
        googlePage.typeQuery(query);
        googlePage.search();
    }

    public boolean checkResults(final String query) {
        return googlePage.checkTitleContains(query);
    }
}
