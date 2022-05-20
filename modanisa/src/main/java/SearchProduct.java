import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;

public class SearchProduct extends BasePage{

    By searchInputLocator=By.id("search-input");
    By searchButtonLocator= By.id("search-button");

    public SearchProduct(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchInputLocator,text);

        WebDriverWait wait =new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator));

        click(searchButtonLocator);


    }




}
