package tests;

import org.junit.Test;

import pages.AutoLoginPage;


/**
 * Created by eproskurin on 18.08.2016.
 */
public class TestAutoLogin {
    private final String startPage = "http://localhost:8080/kis-web-1.0/";
    private final String login = "eproskurin";
    private final String paswword = "dER5N?9";

    @Test
    public void UnitCorrectLogin() {
        AutoLoginPage page = new AutoLoginPage();
        page.correctLogin(startPage, login, paswword);

    }
}

