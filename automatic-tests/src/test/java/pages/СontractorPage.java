package pages;

import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

/**
 * Created by eproskurin on 30.08.2016.
 */
public class СontractorPage  {


    public void addContractor(){
        $(By.xpath("//*data-qtip='Добавить'")).click();
    }


    //class="x-btn round-button x-unselectable x-box-item x-btn-default-small x-btn-after-title"
}
