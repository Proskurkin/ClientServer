package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.*;


/**
 * Created by eproskurin on 18.08.2016.
 */
public class AutoLoginPage {

    public void correctLogin(String page, String login, String password) {
        open(page);
        $(By.name("textfield-1014-inputEl")).setValue(login);
        $(By.name("textfield-1015-inputEl")).setValue(password);
        $(By.xpath("//*[@id=\"button-1021-btnEl\"]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}