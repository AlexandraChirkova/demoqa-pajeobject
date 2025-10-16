package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private final SelenideElement titlePage = $(".text-center");
    private final SelenideElement userName =$("#userName");
    private final SelenideElement userEmail =$("#userEmail");
    private final SelenideElement currentAddress =$("#currentAddress");
    private final SelenideElement permanentAddress =$("#permanentAddress");
    private final SelenideElement submitButton = $("#submit");
    private final SelenideElement infoTable = $("#output");


    public TextBoxPage openPage() {
        open("/text-box");
        titlePage.shouldHave(text("Text Box"));

        return this;
    }

    public TextBoxPage setUserName(String name) {
        userName.setValue(name);

        return this;
    }

    public TextBoxPage setUserEmail(String email) {
        userEmail.setValue(email);

        return this;
    }

    public TextBoxPage setCurrentAddress(String cAddress) {
        currentAddress.setValue(cAddress);

        return this;
    }

    public TextBoxPage setPermanentAddress(String pAddress) {
        permanentAddress.setValue(pAddress);

        return this;
    }

    public TextBoxPage submitForm() {
        submitButton.scrollTo().click();

        return this;
    }

    public TextBoxPage checkResult(String key, String value) {
        infoTable.$(By.id(key)).shouldHave(text(value));

        return this;
    }

}
