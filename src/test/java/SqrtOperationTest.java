import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtOperationTest extends SetUp {


    @Test(dataProvider = "dataProviderForSqrt")
    public void powOperation(double operand, double expectedResult) {
        double actualResult = calculator.sqrt(operand);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of  operation");
    }

    @DataProvider(name = "dataProviderForSqrt")
    public Object[][] dataProviderForSqrt() {
        return new Object[][]{
                {1, 1},
                {4, 2},
                {0, 0}
        };
    }
}
