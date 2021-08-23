import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivByZeroTest extends SetUp {

    @Test(expectedExceptions = {NumberFormatException.class},
            expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divByZero() {
        long actualResult = calculator.div(500, 0);
        Assert.assertEquals(actualResult, 500 / 0);
    }

    @Test(dataProvider = "dataProviderDivByZeroPositiveCases")
    public void divByZeroPositiveCases(long operand1, long operand2, long expectedResult) {
        long actualResult = calculator.div(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of dividing operation");
    }

    @DataProvider(name = "dataProviderDivByZeroPositiveCases")
    public Object[][] dataProviderDivByZeroPositiveCases() {
        return new Object[][]{
                {500, 10, 50},
                {0, 1, 0},
                {-1500, 15, -100},
                {5, 2, 2}
        };

    }
}

