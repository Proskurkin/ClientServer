package tests;

import org.junit.Test;
import pages.ContractorPage;

/**
 * Created by eproskurin on 31.08.2016.
 */
public class TestContractorPage {
    ContractorPage contractorPage = new ContractorPage();

    @Test
    public void testCreateContractor() throws InterruptedException {
        contractorPage.addContractor();
        contractorPage.fillConractor("Заказчик");
        contractorPage.fillNameContractor("Заказчик # ");
        contractorPage.fillPropertyType("ОАО");
        contractorPage.fillPhoneNumber("9991130007");
        contractorPage.fillTimeZone("MSK");
        contractorPage.fillEmail();
        contractorPage.fillSectorAdressId("Москва");
        contractorPage.fillHouseNo(1);
        contractorPage.fillHousingNo(2);
        contractorPage.fillBuildingNo(3);
        contractorPage.fillAddressComments("Ты туда не ходи");
        contractorPage.clickSave();
    }

}
