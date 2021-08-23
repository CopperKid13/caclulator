import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionIntegerTest extends SetUp {

    @Test(dataProvider = "dataProviderForDivInteger")
    public void divisionInteger(long operand1, long operand2, long expectedResult) {
        long actualResult = calculator.div(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of dividing operation");
    }

    @DataProvider(name = "dataProviderForDivInteger")
    public Object[][] dataProviderForDivInteger() {
        return new Object[][]{
                {500, 10, 50},
                {0, 1, 0},
                {-1500, 15, -100},
                {5, 2, 2}
        };

    }
}
