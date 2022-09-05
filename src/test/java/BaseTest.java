import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class BaseTest {

    protected RemoteWebDriver driver = null;


    public void beforeMethod() throws MalformedURLException {
        driver=WebDriverManager.getRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }
}

