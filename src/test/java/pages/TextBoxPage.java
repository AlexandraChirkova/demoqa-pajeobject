package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private SelenideElement
            titlePage = $(".text-center"),
            userName =$("#userName"),
            userEmail =$("#userEmail"),
            currentAddress =$("#currentAddress"),
            permanentAddress =$("#permanentAddress"),
            submitButton = $("#submit"),
            infoTable = $("#output");


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
