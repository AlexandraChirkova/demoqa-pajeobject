package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTest extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void textBoxTest () {
        textBoxPage.openPage()
                .setUserName("Alexandra")
                .setUserEmail("alexandra.chirkova88@gmail.com")
                .setCurrentAddress("Almaty")
                .setPermanentAddress("Almaty")
                .submitForm()
                .checkResult("name", "Alexandra")
                .checkResult("email", "alexandra.chirkova88@gmail.com")
                .checkResult("currentAddress", "Almaty")
                .checkResult("permanentAddress", "Almaty");
    }

}
