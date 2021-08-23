import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest extends SetUp {

    @Test(dataProvider = "dataProviderForSumDouble")
    public void sumDouble(double operand1, double operand2, double expectedResult) {
        double actualResult = calculator.sum(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of sum operation");
    }

    @DataProvider(name = "dataProviderForSumDouble")
    public Object[][] dataProviderForSumDouble() {
        return new Object[][]{
                {50, 6.5, 56.5},
                {3.33, 1.1, 4.43},
                {5.99, -6, -0.01},
                {-2.3, -4.79, -7.09}
        };
    }
}
