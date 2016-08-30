package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by eproskurin on 30.08.2016.
 */
public class ContractorPage {

    public void addContractor() throws InterruptedException {
        $(By.xpath("//*[@data-qtip='Добавить' and @class='x-btn round-button x-unselectable x-box-item x-btn-default-small x-btn-after-title']")).shouldHave(Condition.visible).click();
        $(By.xpath("//*[@name='groupCompanyTypes']")).shouldBe(Condition.visible).setValue("Заказчик");
        $(By.xpath("//ul/li[text() = 'Заказчик']")).doubleClick().pressTab();

        //Генерация рандомных чисел для
        int random = (int) (Math.random()*99999);
        int innRand = 1234500000 +random;
        String client = "Заказчик"+random;

        //Заполнение форм
        $(By.xpath("//*[@name='name']")).setValue("Заказчик#"+random);
        $(By.xpath("//*[@name='propertyTypeId']")).setValue("ОАО");
        $(By.xpath("//*[@name='phoneNumber']")).setValue("9991130007");
        $(By.xpath("//*[@name='timezoneId']")).click();
        $(By.xpath("//ul/li[text()='MSK']")).click();
        $(By.xpath("//*[@name='email']")).setValue("Заказчик"+random+"@mail.ru");
        $(By.xpath("//*[@name='inn']")).setValue(String.valueOf(innRand));
        $(By.xpath("//*[@name='sectorAddressId']")).setValue("Москва");
        Thread.sleep(1200); // Прогрузка комбобокса
        $(By.xpath("//*[@name='sectorAddressId']")).pressEnter();
        $(By.xpath("//*[@name='houseNo']")).setValue(String.valueOf(1));
        $(By.xpath("//*[@name='housingNo']")).setValue(String.valueOf(2));
        $(By.xpath("//*[@name='buildingNo']")).setValue(String.valueOf(3));
        $(By.xpath("//*[@name='addressComments']")).setValue(String.valueOf("Ты туда не ходи"));
        $(By.xpath("//span[text()='Сохранить']")).click();

//        Thread.sleep(1200);
        // Добавление сотрудника
        //$(By.xpath("//*[@style='x-btn round-button x-unselectable x-box-item x-btn-default-small x-btn-after-title'and @data-qtip='Добавить']")).shouldBe(Condition.visible);

//        $(By.xpath("//*[@name='surname' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Крючков");
//        $(By.xpath("//*[@name='name' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Иван");
//        $(By.xpath("//*[@name='middleName' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Петрович");
//        $(By.xpath("//*[@name='name' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Иван");
//        $(By.xpath("//*[@name='phone' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("9997776655");
//        $(By.xpath("//*[@name='email' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("kruk@mail.rus");
//        $(By.xpath("//*[@name='comment' and @class='x-form-field x-form-text x-form-text-default  x-form-invalid-field x-form-invalid-field-default x-form-empty-field x-form-empty-field-default']")).setValue("Альфалидер");
//        $(By.xpath("//*[@role='presentation'='on'and @class='x-btn-icon-el x-btn-icon-el-default-small  ']")).click();











        Thread.sleep(5000);

    }
}
