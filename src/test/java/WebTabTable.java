import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabTable {

    public static void main(String[] args) {
        ChromeDriver driver = ChromeDriverAndPage();
//        basicWebPageExample(driver);
        elementAttributesExamples(driver);
        driver.quit();

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

    public static void elementAttributesExamples(ChromeDriver driver){
        WebElement elementAttributesExamples = driver.findElement(By.id("elementattributestest"));
        elementAttributesExamples.click();
        WebElement button = driver.findElement(By.cssSelector(".styled-click-button"));
        button.click();
        WebElement paragraph = driver.findElement(By.id("jsattributes"));
        System.out.println(paragraph.getAttribute("nextid"));
    }
































}
