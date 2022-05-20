import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchProduct searchProduct;

    public HomePage(WebDriver driver) {
        super(driver);
        searchProduct=new SearchProduct(driver);
    }

    public SearchProduct SearchProduct() {
        return this.searchProduct;
    }

}
