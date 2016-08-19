package pages;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by eproskurin on 18.08.2016.
 */
public class AutoLoginPage {


    public void correctLogin(String page,String login, String password){
        open(page);
        $(By.name("textfield-1014-inputEl")).setValue(login);
        $(By.name("textfield-1015-inputEl")).setValue(password);
        $(By.id("//*[@id=\"button-1021-btnInnerEl\"]")).pressEnter();

    }

    public void incorrectLogin(String page,String login, String password){
        open(page);
        $(By.name("textfield-1014-inputEl")).setValue(login);
        $(By.name("textfield-1015-inputEl")).setValue(password);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
