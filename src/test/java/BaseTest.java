import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest {

    protected static RemoteWebDriver driver = null;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        driver=WebDriverManager.getRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }
}

