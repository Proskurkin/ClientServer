package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by eproskurin on 23.08.2016.
 */
public class MainPage {


    public void hideMenu(){
        $(By.xpath("//*[@data-qtip='Скрыть меню']")).shouldHave(Condition.visible).click();
    }
    public void openMenu(){
        $(By.xpath("//*[@data-qtip='Показать меню']")).shouldHave(Condition.visible).click();
    }

    public void selectMenuItem(String name){
        $(By.xpath("//*[@data-qtip='"+name+"']")).doubleClick();
    }
    public void selectSecondMenuItem(String name){
        $(By.xpath("//*[@data-qtip='"+name+"']")).click();
    }



}
