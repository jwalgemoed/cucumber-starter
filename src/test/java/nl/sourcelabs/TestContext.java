package nl.sourcelabs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This is the test context - referenced from the GoogleSteps. Serenity picks up a reference to this
 * context (by way of annotations):
 *
 * @ContextConfiguration(classes = TestContext.class)
 * @TestPropertySource({"classpath:serenity.properties"})
 *
 * Serenity will intialize it so you can add beans to it (or use scanning as configured here). These beans can then
 * be injected into the GoogleSteps class.
 */
@Configuration
@ComponentScan(basePackages = { "nl.sourcelabs" })
public class TestContext {
}
