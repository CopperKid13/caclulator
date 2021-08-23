import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosFunctionTest extends SetUp {

    @Test(dataProvider = "dataProviderForCos")
    public void cosOperation(double operand, double expectedResult) {
        double actualResult = calculator.cos(Math.toRadians(operand));
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of  operation");
    }

    @DataProvider(name = "dataProviderForCos")
    public Object[][] dataProviderForCos() {
        return new Object[][]{
                {0, 0},
                {60, 0.5},
                {90, 0},
                {180, -1},
                {270, 0}
        };
    }
}
