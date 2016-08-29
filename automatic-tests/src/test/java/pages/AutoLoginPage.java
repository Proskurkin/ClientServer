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
        String text = "Скрыть меню";
        $(By.name("textfield-1014-inputEl")).setValue(login);
        $(By.name("textfield-1015-inputEl")).setValue(password);
        $(By.xpath("//*[@id=\"button-1021-btnEl\"]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        $(By.xpath("//*[@data-qtip='Скрыть меню']")).shouldHave(Condition.visible).click();
        //$(By.xpath("//*[@data-qtip='Показать меню']")).shouldHave(Condition.visible).click();
        //$(By.xpath("//*[@id='treeview-1021-record-126']/tbody/tr/td[1]/div/span")).click();
        $(By.xpath("//*[@data-qtip='Техническая поддержка']")).doubleClick();

        //$(By.xpath("*[@class=\"treeview-1021-record-126\"]/tbody/tr/td[1]/div/span")).click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        $(By.xpath("//*[@id=\"button-1053-btnEl\"]")).click();
//        $(By.xpath("//*[@id=\"menuitem-1055-textEl\"]")).shouldBe(Condition.visible).shouldHave(Condition.text("Пользователи")).click();
    }
}