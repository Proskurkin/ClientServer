package tests;

import com.codeborne.selenide.ex.ElementNotFound;
import org.junit.Test;
import pages.ContractorPage;

import static pages.MainPage.*;
import static tests.TestAutoLogin.UnitCorrectLogin;
import static tests.TestContractorPage.*;
import static tests.TestHelper.searchFilterSetValue;


/**
 * Created by eproskurin on 30.08.2016.
 */
public class TestMainPage {

    @Test
    public void testOpenMenu() throws ElementNotFound, InterruptedException {
        UnitCorrectLogin();
        selectMenuItem("Все справочники");
        selectSecondMenuItem("Справочник контрагентов");

        testCreateContractor();
        openEmployeeMarker();
        createEmployee();
        openCatalog();
        searchFilterSetValue("Сокр. название", ContractorPage.getContractorName());
        Thread.sleep(5000);
    }

    @Test
    public  void testHideShowMenu(){
        UnitCorrectLogin();
        hideMenu();
        openMenu();
    }
}
