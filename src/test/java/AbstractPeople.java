import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public abstract class AbstractPeople { @BeforeEach
public void setUp() {

    Selenide.open("https://people.sovcombank.ru");
}
    @AfterEach
    public void tearDown(){}
}
