package tests;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import pages.AutoLoginPage;

/**
 * Created by eproskurin on 18.08.2016.
 */
public class TestAutoLogin {
    private String startPage = "http://localhost:8080/kis-web-1.0/";
    private String login = "eproskurin";
    private String paswword = "dER5N?9";

    @Test
    public void UnitCorrectLogin() {
        AutoLoginPage page = new AutoLoginPage();
        page.correctLogin(startPage, login, paswword);
    }

    @Test
    public void UnitIncorrectLogin(){
        AutoLoginPage page = new AutoLoginPage();
        page.incorrectLogin(startPage, login+1, paswword);

    }
}
