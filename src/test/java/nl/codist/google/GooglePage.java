package nl.codist.google;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object. Serenity manages this page object. The interesting part is that the host can be overridden by a property
 * in the properties file:
 *
 * webdriver.base.url=http://www.google.com
 *
 * This can help greatly in environments where you want to test against different environments. Only replaces the host
 * part, all subpaths are kept (i.e. @DefaultUrl("http://bla.com/bla") -> will yield http://www.google.com/bla with
 * the property set as above.
 *
 * This class extends PageObject which abstracts away webdriver interaction. See the API-docs for more useful methods
 * that are available thanks to this.
 */
@DefaultUrl("http://www.google.nl")
public class GooglePage extends PageObject {

    // Serenity can inject page elements by using these annotations. Based on xpath, id, class, name.
    @FindBy(className = "gsfi")
    private WebElement queryBox;

    // Serenity can inject page elements by using these annotations. Based on xpath, id, class, name.
    @FindBy(name = "btnG")
    private WebElement searchButton;

    // Method called after a page is opened (open() called on this page object) - use this space to confirm loading
    // has finished
    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(queryBox).waitUntilVisible();
    }

    // Methods performing actions/checks on the page
    public void typeQuery(final String query) {
        queryBox.sendKeys(query);
    }

    public void search() {
        searchButton.click();
    }

    public boolean checkTitleContains(String query) {
        return this.getTitle().contains(query);
    }
}
