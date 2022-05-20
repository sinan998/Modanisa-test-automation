import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AddProductToCart extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void searchProdct(){
        homePage=new HomePage(driver);
        homePage.SearchProduct().search("elbise");
        productsPage=new ProductsPage(driver);
        Assertions.assertTrue(productsPage.isOnProductsPage(),"Not on products page");
    }

    @Test
    @Order(2)
    public void selectProduct(){
        productsPage.select();
        productDetailPage= new ProductDetailPage(driver);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on Product detail page");
    }

    @Test
    @Order(3)
    public void addToCart(){
        productDetailPage.selectSize(1);
        productDetailPage.Add();
        Assertions.assertTrue(productDetailPage.count(),"Product did not add to cart");
    }

    @Test
    @Order(4)
    public void goToCart(){
        cartPage= new CartPage(driver);
        productDetailPage.goToCartButton();
        Assertions.assertTrue(cartPage.isOnCartPage(),"Not on cart page");
    }





}
