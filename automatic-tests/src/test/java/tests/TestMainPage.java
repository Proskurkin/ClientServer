package tests;

import com.codeborne.selenide.ex.ElementNotFound;
import org.junit.Test;
import pages.ContractorPage;
import pages.MainPage;

/**
 * Created by eproskurin on 30.08.2016.
 */
public class TestMainPage {
    TestAutoLogin testAutoLogin = new TestAutoLogin();
    MainPage mainPage = new MainPage();
    ContractorPage contractorPage = new ContractorPage();
    TestContractorPage testContractorPage = new TestContractorPage();


    @Test
    public void testOpenMenu() throws ElementNotFound, InterruptedException { //Выбор грида
        testAutoLogin.UnitCorrectLogin();
        mainPage.selectMenuItem("Все справочники");
        mainPage.selectSecondMenuItem("Справочник контрагентов");
        //testContractorPage.testCreateContractor();
        testContractorPage.openEmployeeMarker();
        testContractorPage.createEmployee();


    }


    @Test
    public void testHideShowMenu(){
        testAutoLogin.UnitCorrectLogin();
        mainPage.hideMenu();
        mainPage.openMenu();
    }

}
