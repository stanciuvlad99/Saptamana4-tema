import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManager {

//    public static ChromeDriver chromeDriver(){
//        System.setProperty("webdriver.chrome.driver" , "src/test/resources/chromedriver.exe");
//        return new ChromeDriver();

//    }

    public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
    }

}
