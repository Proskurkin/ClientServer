package tests;

import org.junit.Test;

import static pages.ContractorPage.*;
import static pages.ContractorPage.tabEmployeeMarker;


/**
 * Created by eproskurin on 31.08.2016.
 */
public class TestContractorPage extends TestHelper{

    @Test
    public static void testCreateContractor() throws InterruptedException {
        addContractor();
        fillContractor("Заказчик");
        fillContractorName("Заказчик # ");
        fillContractorPropertyType("ОАО");
        fillContractorPhoneNumber("9991130007");
        fillContractorTimeZone("MSK");
        fillContractorEmail();
        fillContractorInn();
        fillContractorSectorAddressId("Москва");
        fillContractorHouseNo(1);
        fillContractorHousingNo(2);
        fillContractorBuildingNo(3);
        fillContractorAddressComments("Ты туда не ходи");
        clickSave();

    }



    @Test
    public static void createEmployee() throws InterruptedException {
        addEmployee();
        fillEmployeeCompany();
        fillEmployeeSurname("Морковкин");
        fillEmployeeName("Василий");
        fillEmployeeMidlName("Петрович");
        fillEmployeeComment("Хороший");
        fillEmployeeEmail("Morkva@maill.ru");
        fillEmployeePhone("9991550203");
        fillEmployeePosition("Генеральный Директор");
        EmployeeClickOk();
    }

    @Test
    public static void editContractor(String name){
    }


    @Test
    public static void openEmployeeMarker(){
        tabEmployeeMarker();
    }

    @Test
    public static void openCatalog(){
        try {
            tabCatalog();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
