import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class PeoplePage {

public static final SelenideElement Vacancy = $(".button.button.button_primary.v-btn--default.v-btn.v-btn--has-bg.theme--light.v-size--default");
public static final SelenideElement closePopUpButton = $("button.close-btn");
public static final SelenideElement inputCityList =  $("input[placeholder='Все города']");
//public static final SelenideElement inputCompanyList = $("input[placeholder='Все города']") ;
//public static final SelenideElement chooseScbt =  $("#input-158");

    public PeoplePage clickVacancy() {
        Vacancy.click();
        return this;
}
    public PeoplePage closeButtonSova() {
        closePopUpButton.click();
        return this;
    }

    public PeoplePage owlClose() {
        if(closePopUpButton.isDisplayed()){
            closePopUpButton.click();//данный метод реализован таким образом, по причине того, что поп-ап появляется не регулярно.
        }
        return this;
    }

    public PeoplePage openCityList() {
        inputCityList.setValue("Москва").pressEnter();
        return this;
    }
//    public PeoplePage openCompanyList() {
//        inputCompanyList.setValue("Cовкомбанк Технологии").pressEnter();
//        return this;
//    }
//    public PeoplePage openCompanyList() {
//        inputCompanyList.click();
//        return this;
//    }
//    public PeoplePage openCompanyList() {
//        inputCompanyList.selectByVisibleText("Совкомбанк Технологии");
//        return this;
//    }
//    public PeoplePage chooseCompany() {
//        chooseScbt.click();
//        return this;
//    }

}
