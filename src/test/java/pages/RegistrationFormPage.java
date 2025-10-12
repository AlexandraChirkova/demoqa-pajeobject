package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

    private SelenideElement
            titleForm = $("div[class='practice-form-wrapper'] h5"),
            firstName = $("#firstName"),
            lastName=$("#lastName"),
            userEmail= $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userPhoneNumber = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            submitButton = $("#submit");


    CalendarComponent calendarComponent = new CalendarComponent();

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        titleForm.shouldHave(text("Student Registration Form"));

        return this;
    }

    public RegistrationFormPage setFirstName(String name) {
        firstName.setValue(name);

        return this;
    }

    public RegistrationFormPage setLastName(String lastName) {
        this.lastName.setValue(lastName);

        return this;
    }

    public RegistrationFormPage setEmail(String email) {
        userEmail.setValue(email);

        return this;
    }

    public RegistrationFormPage setGender(String gender) {
        genderWrapper.$(byText(gender)).click();

        return this;
    }

    public RegistrationFormPage setUserNumber(String number) {
        userPhoneNumber.setValue(number);

        return this;
    }
    public RegistrationFormPage setDateOfBirth(String day, String month, String year) {
        calendarInput.scrollTo().click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationFormPage setSubject (String subject) {
        subjectsInput.scrollTo().setValue(subject).pressEnter();

        return this;
    }

    public RegistrationFormPage setHobby(String hobby) {
        $(byText(hobby)).click();

        return this;
    }

    public RegistrationFormPage setPicture(String path) {
        uploadPicture.uploadFromClasspath(path);

        return this;
    }

    public RegistrationFormPage setAddress(String address) {
        currentAddress.setValue(address);

        return this;
    }

    public RegistrationFormPage setState(String state) {
        stateInput.click();
        $(byText(state)).click();

        return this;
    }

    public RegistrationFormPage setCity(String city) {
        cityInput.click();
        $(byText(city)).click();

        return this;
    }

    public void submitForm() {
        submitButton.scrollTo().click();

    }

}
