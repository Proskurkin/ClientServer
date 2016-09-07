package tests;

import org.junit.Test;

import pages.AutoLoginPage;


/**
 * Created by eproskurin on 18.08.2016.
 */
public class TestAutoLogin {
    private static final String startPage = "http://localhost:8080/kis-web-1.0/";
    private static final String login = "admin";
    private static final String paswword = "QxF3#10";

    @Test
    public static void UnitCorrectLogin() {
        AutoLoginPage page = new AutoLoginPage();
        page.correctLogin(startPage, login, paswword);

    }
}

