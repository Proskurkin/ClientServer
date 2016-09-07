package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by eproskurin on 30.08.2016.
 */
public class ContractorPage {
    //Генерация случайны чисел
    public static int random = (int) (Math.random() * 10000);
    private static int inn = 1111100000 + random;
    public static String contractorName = "";

    public static void addContractor() throws InterruptedException {
        $(By.xpath("//*[@data-qtip='Добавить' and @class='x-btn round-button x-unselectable x-box-item x-btn-default-small x-btn-after-title']")).shouldHave(Condition.visible).click();
    }
    public static void fillContractor(String contractor) {
        $(By.xpath("//*[@name='groupCompanyTypes']")).shouldBe(Condition.visible).setValue(contractor);
        $(By.xpath("//ul/li[text() = " + "'" + contractor + "'" + "]")).doubleClick().pressTab();
    }
    public static void fillContractorName(String name) {
        $(By.xpath("//*[@name='name']")).setValue(name + random);
        contractorName = name + random;
    }
    public static void fillContractorPropertyType(String type) {
        $(By.xpath("//*[@name='propertyTypeId']")).setValue("ОООО"); // комбобокс начинает работать после ввода 4-ех символов
        $(By.xpath("//ul/li[text() =" + "'" + type + "'" + "]")).click();
    }
    public static void fillContractorPhoneNumber(String number) { //"9991130007"
        $(By.xpath("//*[@name='phoneNumber']")).setValue(number);
    }
    public static void fillContractorTimeZone(String timeZone) {
        $(By.xpath("//*[@name='timezoneId']")).click();
        $(By.xpath("//ul/li[text()=" + "'" + timeZone + "'" + "]")).click();
    }
    public static void fillContractorEmail() {
        $(By.xpath("//*[@name='email']")).setValue("Client" + random + "@mail.ru");
    }
    public static void fillContractorInn() {
        $(By.xpath("//*[@name='inn']")).setValue(String.valueOf(inn));
    }
    public static void fillContractorSectorAddressId(String sector) throws InterruptedException {
        $(By.xpath("//*[@name='sectorAddressId']")).setValue(sector);
        Thread.sleep(2000); // Ожидание подргрузки комбобокса
        $(By.xpath("//*[@name='sectorAddressId']")).pressEnter();
    }
    public static void fillContractorHouseNo(int number) {
        $(By.xpath("//*[@name='houseNo']")).setValue(String.valueOf(number));
    }
    public static void fillContractorHousingNo(int number) {
        $(By.xpath("//*[@name='housingNo']")).setValue(String.valueOf(number));
    }
    public static void fillContractorBuildingNo(int number) {
        $(By.xpath("//*[@name='buildingNo']")).setValue(String.valueOf(number));
    }
    public static void fillContractorAddressComments(String comment) {
        $(By.xpath("//*[@name='addressComments']")).setValue(String.valueOf(comment));
    }
    public static void clickSave() {
        $(By.xpath("//span[text()='Сохранить']")).click();
    }

    public static void tabEmployeeMarker() {
        $(byText("Сотрудники")).shouldBe(Condition.visible).click();
    }
    public static void tabCatalog() throws InterruptedException {
        $(byText("Справочник контрагентов")).shouldBe(Condition.visible).click();
        Thread.sleep(5000);
    }
    public static void addEmployee() throws ElementNotFound {
        WebElement ele = $$(By.xpath("//*[@data-qtip='Добавить']")).get(1); // костыль
        $(ele).pressEnter();
    }
    public static void fillEmployeeCompany(){
        $(By.xpath("//*[@name='contractorId']")).setValue(contractorName);
        $(byText(contractorName)).click();
    }
    public static void fillEmployeeSurname(String surname){
        $(By.xpath("//*[@name='surname' and @placeholder='Фамилия']")).setValue(surname);
    }
    public static void fillEmployeeName(String surname){
        $(By.xpath("//*[@name='name' and @placeholder='Имя']")).setValue(surname);
    }
    public static void fillEmployeeMidlName(String surname){
        $(By.xpath("//*[@name='middleName' and @placeholder='Отчество']")).setValue(surname);
    }
    public static void fillEmployeePhone(String surname){
        $(By.xpath("//*[@name='phone' and @placeholder='Телефон']")).setValue(surname);
    }
    public static void fillEmployeeEmail(String surname){
        $(By.xpath("//*[@name='email' and @placeholder='E-mail']")).setValue(surname);
    }
    public static void fillEmployeeComment(String surname){
        $(By.xpath("//*[@name='comment' and @placeholder='Комментарий']")).setValue(surname);
    }
    public static void fillEmployeePosition(String name){
        $(By.xpath("//*[@name='position' and @value='Исполнитель']")).setValue(name);
        $(byText(name)).shouldBe(Condition.visible).click();

    }
    public static void EmployeeClickOk() throws InterruptedException {
        $(byText("Ok")).click();
        Thread.sleep(500);
    }

    public static int getRandom() {
        return random;
    }

    public static int getInn() {
        return inn;
    }

    public static String getContractorName() {
        return contractorName;
    }
}











