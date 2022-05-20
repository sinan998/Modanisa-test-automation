import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

    By cartSummaryLocator= new By.ByCssSelector("h2[class=\"basketSummary-head\"]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCartPage() {
        WebDriverWait wait= new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartSummaryLocator));
        return isDispalayed(cartSummaryLocator);
    }

}
