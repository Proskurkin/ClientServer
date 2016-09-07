package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by eproskurin on 06.09.2016.
 */
public class TestHelper {
    @Test
    public static void searchFilterSetValue(String filter, String value){
        $(By.xpath(".//span[text()='" + filter + "']/../../../..//input")).setValue(value).pressEnter();// долги поиск жлемента
        $(By.xpath("//tbody/tr/td/div[text()='"+value+"']")).doubleClick();
    }
}
