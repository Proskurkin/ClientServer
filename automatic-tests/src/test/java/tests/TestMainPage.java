package tests;

import org.junit.Test;
import pages.MainPage;

/**
 * Created by eproskurin on 30.08.2016.
 */
public class TestMainPage {
    TestAutoLogin testAutoLogin = new TestAutoLogin();
    MainPage mainPage = new MainPage();


    @Test
    public void testOpenMenu() throws InterruptedException {
        testAutoLogin.UnitCorrectLogin();
        mainPage.hideMenu();
        mainPage.openMenu();
        mainPage.selectMenuItem("Все справочники");
        mainPage.selectSecondMenuItem("Справочник контрагентов");


        Thread.sleep(5000);
    }

}
