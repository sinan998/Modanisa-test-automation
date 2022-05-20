import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class ProductDetailPage extends BasePage{

    By sizeBoxContainer =By.id("size-box-container");
    By productSizeLocator=new By.ByCssSelector("select.productSizeSelect option[data-product-id=\"7906130\"]");
    By basketButtonLocator= new By.ByCssSelector("div.clearfix a.basket-button");
    By countLocator= new By.ByCssSelector("a[id=\"cart\"] div[class=\"count\"]");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        WebDriverWait wait= new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(sizeBoxContainer));
        return isDispalayed(sizeBoxContainer);
    }


    public void selectSize(int i) {
        getAllSize().get(1).click();
    }

    public boolean count() {
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(countLocator));
        String text =find(countLocator).getText();
        return Integer.parseInt(text)>0;
    }

    public void goToCartButton() {
        find(countLocator).click();
    }

    public void Add() {

        click(basketButtonLocator);
    }

    private List<WebElement> getAllSize(){
        return findAll(productSizeLocator);
    }

}
