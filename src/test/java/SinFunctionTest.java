import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinFunctionTest extends SetUp {


    @Test(dataProvider = "dataProviderForSin")
    public void sinOperation(double operand, double expectedResult) {
        double actualResult = calculator.sin(Math.toRadians(operand));
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of  operation");
    }

    @DataProvider(name = "dataProviderForSin")
    public Object[][] dataProviderForSin() {
        return new Object[][]{
                {0, 0},
                {30, 0.5},
                {90, 1},
                {180, 0},
                {270, -1}
        };
    }
}
