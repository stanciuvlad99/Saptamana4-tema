import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabTable {

    public static void main(String[] args) {
        ChromeDriver driver = ChromeDriverAndPage();
        basicWebPageExample(driver);

    }

    public static ChromeDriver ChromeDriverAndPage(){
        ChromeDriver driver = WebDriverManager.chromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        return driver;

    }

    public static void basicWebPageExample(ChromeDriver driver){
        WebElement basicWebPageExample = driver.findElement(By.id("basicpagetest"));
        basicWebPageExample.click();
        WebElement text = driver.findElement(By.id("para1"));
        System.out.println(text.getText());
        WebElement text1 = driver.findElement(By.id("para2"));
        System.out.println(text1.getText());
    }
}
