package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by eproskurin on 30.08.2016.
 */
public class ContractorPage {
    //Генерация случайны чисел
    private int random = (int) (Math.random() * 10000);
    private int inn = 1111100000 + random;
    private String client = "Заказчик # " + random;

    public void addContractor() throws InterruptedException {
        $(By.xpath("//*[@data-qtip='Добавить' and @class='x-btn round-button x-unselectable x-box-item x-btn-default-small x-btn-after-title']")).shouldHave(Condition.visible).click();
    }

    public void fillConractor(String contractor) {
        $(By.xpath("//*[@name='groupCompanyTypes']")).shouldBe(Condition.visible).setValue(contractor);
        $(By.xpath("//ul/li[text() = "+"'" +contractor+"'"+"]")).doubleClick().pressTab();
    }

    public void fillNameContractor(String name) {
        $(By.xpath("//*[@name='name']")).setValue(name+random);
    }

    public void fillPropertyType(String type) {
        $(By.xpath("//*[@name='propertyTypeId']")).setValue("ОООО"); // комбобокс начинает работать после ввода 4-ех символов
        $(By.xpath("//ul/li[text() ="+"'" +type+"'"+"]")).click();
    }

    public void fillPhoneNumber(String number) { //"9991130007"
        $(By.xpath("//*[@name='phoneNumber']")).setValue(number);
    }

    public void fillTimeZone(String timeZone) {
        $(By.xpath("//*[@name='timezoneId']")).click();
        $(By.xpath("//ul/li[text()="+"'" +timeZone+"'"+"]")).click();
    }

    public void fillEmail() {
        $(By.xpath("//*[@name='email']")).setValue("Client" + random + "@mail.ru");
    }

    public void fillInn() {
        $(By.xpath("//*[@name='inn']")).setValue(String.valueOf(inn));
    }

    public void fillSectorAdressId(String sector) throws InterruptedException {
        $(By.xpath("//*[@name='sectorAddressId']")).setValue(sector);
        Thread.sleep(1200); // Ожидание подргрузки комбобокса
        $(By.xpath("//*[@name='sectorAddressId']")).pressEnter();
    }

    public void fillHouseNo(int number) {
        $(By.xpath("//*[@name='houseNo']")).setValue(String.valueOf(number));
    }

    public void fillHousingNo(int number) {
        $(By.xpath("//*[@name='housingNo']")).setValue(String.valueOf(number));
    }

    public void fillBuildingNo(int number) {
        $(By.xpath("//*[@name='buildingNo']")).setValue(String.valueOf(number));
    }

    public void fillAddressComments(String comment) {
        $(By.xpath("//*[@name='addressComments']")).setValue(String.valueOf(comment));
    }

    public void clickSave() {
        $(By.xpath("//span[text()='Сохранить']")).click();
    }
}



//        $(By.xpath("//*[@name='surname' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Крючков");
//        $(By.xpath("//*[@name='name' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Иван");
//        $(By.xpath("//*[@name='middleName' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Петрович");
//        $(By.xpath("//*[@name='name' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Иван");
//        $(By.xpath("//*[@name='phone' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("9997776655");
//        $(By.xpath("//*[@name='email' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("kruk@mail.rus");
//        $(By.xpath("//*[@name='comment' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Альфалидер");
//        $(By.xpath("//*[@role='presentation'='on'and @class='x-btn-icon-el x-btn-icon-el-default-small  ']")).click();











