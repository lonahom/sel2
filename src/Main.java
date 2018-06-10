import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
    webDriver.get("https://portal.aait.edu.et");
    WebElement x = webDriver.findElement(By.id("UserName"));
        x.sendKeys("ate/9373/08");
        WebElement y=webDriver.findElement(By.id("Password"));
        y.sendKeys("neverelec");

//        WebElement y= webDriver.findElement(By.name("pass"));
//        y.sendKeys("halamadrid@10");


        List <WebElement> webElements=webDriver.findElements(By.tagName("button"));

        webElements.get(1).click();
        System.out.println("Year:"+webDriver.findElement(By.cssSelector("body > div.container-fluid.col-md-12 > div > div.col-md-10 > div > div > div > div > div > div:nth-child(1) > table > tbody > tr:nth-child(7) > td:nth-child(2)")).getText());




    }
}
