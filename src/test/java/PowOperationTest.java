import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowOperationTest extends SetUp {

    @Test(dataProvider = "dataProviderForPow")
    public void powOperation(double operand1, double operand2, double expectedResult) {
        double actualResult = calculator.pow(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of  operation");
    }

    @DataProvider(name = "dataProviderForPow")
    public Object[][] dataProviderForPow() {
        return new Object[][]{
                {1, 1, 1},
                {0, 1, 0},
                {2, 4, 16},
                {2.5, 2, 6.25}
        };
    }
}
