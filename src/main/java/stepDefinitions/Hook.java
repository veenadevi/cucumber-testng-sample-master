package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import MyRunner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends TestRunner {
    public WebDriver driver ;

    @Before
    public void updateName(Scenario scenario) throws InterruptedException {
        Thread.sleep(30);
WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
      // driver.executeScript("lambda-name=" + scenario.getName());
    }

    @After
    public void close_the_browser(Scenario scenario) {
       // driver.executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
      //  System.out.println(driver.getSessionId());

        //driver.quit();
    }

}