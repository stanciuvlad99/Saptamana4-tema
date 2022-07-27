import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabTable {

    public static void main(String[] args) {
        ChromeDriver driver = createChromeDtiverAndPage();
        x(driver);

    }

    public static ChromeDriver createChromeDtiverAndPage(){
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        return driver;
    }

    public static void x(ChromeDriver driver){
        System.out.println("");
    }
}
