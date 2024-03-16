import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

public class CheckoutPage {
    private final SelenideElement firstNameInput = $("#first-name");
    private final SelenideElement lastNameInput = $("#last-name");
    private final SelenideElement zipCodeInput = $(By.name("postalCode"));
    private final SelenideElement continueButton = $("#continue");
    private final SelenideElement finishButton = $("#finish");

    public void enterFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.setValue(lastName);
    }

    public void enterZipCode(String zipCode) {
        zipCodeInput.setValue(zipCode);
    }

    public void continueToNextStep() {
        continueButton.click();
    }

    public void finishCheckout() {
        finishButton.click();
    }
}
