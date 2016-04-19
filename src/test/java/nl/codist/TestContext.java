package nl.codist;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"nl.codist"})
public class TestContext implements ApplicationContextAware {

    public TestContext() {
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }
}
