import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTabTable {

    public static void main(String[] args) {
        ChromeDriver driver = ChromeDriverAndPage();
//        basicWebPageExample(driver);
//        elementAttributesExamples(driver);
//        findByPlayground(driver);
        tableTestPage(driver);
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

    public static void findByPlayground (ChromeDriver driver){
        WebElement findByPlayground = driver.findElement(By.id("findbytest"));
        findByPlayground.click();
        WebElement first = driver.findElement(By.id("p1"));
        System.out.println(first.getText());
        WebElement second = driver.findElement(By.cssSelector(".normal"));
        System.out.println(second.getText());
        WebElement third = driver.findElement(By.name("pName1"));
        System.out.println(third.getText());


    }

    public static void tableTestPage (ChromeDriver driver){
        WebElement tableTestPage = driver.findElement(By.id("tablestest"));
        tableTestPage.click();
       List<WebElement> tableRows = driver.findElements(By.cssSelector("table#mytable tr"));
       WebElement firstRow = tableRows.get(0);
       List<WebElement> firstRowColumn = firstRow.findElements(By.cssSelector("th"));
       System.out.println("Header din prima coloana: " + firstRowColumn.get(0).getText());
       System.out.println("Header din prima coloana: " + firstRowColumn.get(1).getText());





    }





























}
