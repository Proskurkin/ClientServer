package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

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
        $(By.xpath("//ul/li[text() = " + "'" + contractor + "'" + "]")).doubleClick().pressTab();
    }

    public void fillNameContractor(String name) {
        $(By.xpath("//*[@name='name']")).setValue(name + random);
    }

    public void fillPropertyType(String type) {
        $(By.xpath("//*[@name='propertyTypeId']")).setValue("ОООО"); // комбобокс начинает работать после ввода 4-ех символов
        $(By.xpath("//ul/li[text() =" + "'" + type + "'" + "]")).click();
    }

    public void fillPhoneNumber(String number) { //"9991130007"
        $(By.xpath("//*[@name='phoneNumber']")).setValue(number);
    }

    public void fillTimeZone(String timeZone) {
        $(By.xpath("//*[@name='timezoneId']")).click();
        $(By.xpath("//ul/li[text()=" + "'" + timeZone + "'" + "]")).click();
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

    public void tabEmployeeMarker() {
        $(byText("Сотрудники")).shouldBe(Condition.visible).click();
    }

    public void addEmployee() throws ElementNotFound {
        WebElement ele = $$(By.xpath("//*[@data-qtip='Добавить']")).get(1);
        $(ele).pressEnter();

        //$(By.xpath("//*[@data-qtip='Добавить']")).click();
        //<a class="x-btn round-button x-unselectable x-box-item x-btn-default-small x-btn-after-title" hidefocus="on" unselectable="on" id="button-1698" tabindex="0" data-qtip="Добавить" componentid="button-1698" style="right: auto; left: 1110px; top: 0px; margin: 0px;"><span id="button-1698-btnWrap" data-ref="btnWrap" role="presentation" unselectable="on" style="" class="x-btn-wrap x-btn-wrap-default-small "><span id="button-1698-btnEl" data-ref="btnEl" role="presentation" unselectable="on" style="" class="x-btn-button x-btn-button-default-small  x-btn-no-text x-btn-icon x-btn-icon-left x-btn-button-center "><span id="button-1698-btnIconEl" data-ref="btnIconEl" role="presentation" unselectable="on" class="x-btn-icon-el x-btn-icon-el-default-small gridRoundButton " style="background-image:url(resources/icons/svg/basic/greenPlus.svg);">&nbsp;</span><span id="button-1698-btnInnerEl" data-ref="btnInnerEl" unselectable="on" class="x-btn-inner x-btn-inner-default-small">&nbsp;</span></span></span></a>

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











