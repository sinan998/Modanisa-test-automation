import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {


    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void type(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isDispalayed(By locator){
        return find(locator).isDisplayed();
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

}
