package nl.codist;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("http://www.nu.nl")
public class GooglePage extends PageObject {

    // Find by classname. This list should be empty if there are no failures
    @FindBy(className = "gsfi")
    private WebElement queryBox;

    // Find by classname. This list should be empty if there are no failures
    @FindBy(name = "btnG")
    private WebElement searchButton;

    // Initializer. When a class calls 'open()' on this page object, this code will be executed afterwards
    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(queryBox).waitUntilVisible();
    }

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
