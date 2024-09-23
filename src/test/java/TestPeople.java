import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPeople extends AbstractPeople{
    PeoplePage peoplePage = new PeoplePage();

    @Test
    //Данный тест кейс не удалось завершить, так как возникли проблемы с поиском работающих локаторов.
    public void testPositive(){
        peoplePage.owlClose()
                .clickVacancy()
                .owlClose()
                .openCityList();
//                .openCompanyList();
//                .chooseCompany();
    }
}
