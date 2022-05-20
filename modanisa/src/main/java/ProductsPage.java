import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage{

    By productInfoLocator=By.id("product-info");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {
        WebDriverWait wait= new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(productInfoLocator));
        return isDispalayed(productInfoLocator);
    }


    public void select() {
        find(productInfoLocator).click();
    }

}
