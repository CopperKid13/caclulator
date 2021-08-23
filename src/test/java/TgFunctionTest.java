import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgFunctionTest extends SetUp {

    @Test(dataProvider = "dataProviderForTg")
    public void tgOperation(double operand, double expectedResult) {
        double actualResult = calculator.tg(Math.toRadians(operand));
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of  operation");
    }

    @DataProvider(name = "dataProviderForTg")
    public Object[][] dataProviderForTg() {
        return new Object[][]{
                {0, 0},
                {45, 1},
                {90, 0},
                {180, 0}
        };
    }
}
