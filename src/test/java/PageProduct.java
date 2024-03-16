import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class PageProduct {
    private final SelenideElement firstItemAddToCartButton = $("#add-to-cart-sauce-labs-backpack");
    private final SelenideElement bikeLight = $("#add-to-cart-sauce-labs-bike-light");
    public void addBackPackToCart() {
        firstItemAddToCartButton.click();

    }
    public void addBikeLightToCart() {
    bikeLight.click();
    }
    public void goToCart() {
        $("#shopping_cart_container").click();
    }
}
