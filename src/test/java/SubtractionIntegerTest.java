import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionIntegerTest extends SetUp {

    @Test(dataProvider = "dataProviderForSubInteger")
    public void subtractionInteger(long operand1, long operand2, long expectedResult) {
        long actualResult = calculator.sub(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of subtraction operation");
    }

    @DataProvider(name = "dataProviderForSubInteger")
    public Object[][] dataProviderForSubInteger() {
        return new Object[][]{
                {6, 1, 5},
                {5, 6, -1},
                {5, -6, -11},
                {-2, -4, -6},
                {1, 0, 1},
                {0, 0, 0}
        };
    }

}
