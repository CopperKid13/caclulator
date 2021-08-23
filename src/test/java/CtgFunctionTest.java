import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgFunctionTest extends SetUp {

    @Test(dataProvider = "dataProviderForCtg")
    public void ctgOperation(double operand, double expectedResult) {
        double actualResult = calculator.ctg(Math.toRadians(operand));
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of  operation");
    }

    @DataProvider(name = "dataProviderForCtg")
    public Object[][] dataProviderForCtg() {
        return new Object[][]{
                {0, 0},
                {45, 1},
                {90, 0},
                {270, 0}
        };
    }
}
