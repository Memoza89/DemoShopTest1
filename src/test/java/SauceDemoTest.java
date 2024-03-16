import org.junit.jupiter.api.Test;

public class SauceDemoTest extends BaseTest {
    @Test
    public void testAddItemsToCartAndCheckout() {
        LoginPage loginPage = new LoginPage();
        PageProduct productPage = new PageProduct();
        CartPage cartPage = new CartPage();
        CheckoutPage checkoutPage = new CheckoutPage();

        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");

        productPage.addBackPackToCart();
        productPage.addBikeLightToCart();
        productPage.goToCart();

        cartPage.proceedToCheckout();

        checkoutPage.enterFirstName("Iuliia");
        checkoutPage.enterLastName("Ziuzko");
        checkoutPage.enterZipCode("1234589");
        checkoutPage.continueToNextStep();
    }
}
