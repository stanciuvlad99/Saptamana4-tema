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
//        tableTestPage(driver);
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
        System.out.println("\nHeader din prima coloana: " + firstRowColumn.get(0).getText());
        System.out.println("Header din prima coloana: " + firstRowColumn.get(1).getText());

        WebElement secondRow = tableRows.get(1);
        List<WebElement> secondRowColumn = secondRow.findElements(By.cssSelector("td"));
        System.out.println("\nHeader din a doua coloana: " + secondRowColumn.get(0).getText());
        System.out.println("Header din a doua coloana: " + secondRowColumn.get(1).getText());

        WebElement thirdRow = tableRows.get(2);
        List<WebElement> thirdRowColumn = thirdRow.findElements(By.cssSelector("td"));
        System.out.println("\nHeader din a treia coloana: " + thirdRowColumn.get(0).getText());
        System.out.println("Header dim a treia coloana: " + thirdRowColumn.get(1).getText());

        WebElement forthRow= tableRows.get(3);
        List<WebElement> forthRowColumn = forthRow.findElements(By.cssSelector("td"));
        System.out.println("\nHeader din a patra coloana: " + forthRowColumn.get(0).getText());
        System.out.println("Header din a patra coloana: " + forthRowColumn.get(1).getText());


        WebElement fifthRow = tableRows.get(4);
        List<WebElement> fifthRowColumn = fifthRow.findElements(By.cssSelector("td"));
        System.out.println("\nHeader din a cincea coloana: " + fifthRowColumn.get(0).getText());
        System.out.println("Header din a cincea coloana: " + fifthRowColumn.get(1).getText());





    }





























}
