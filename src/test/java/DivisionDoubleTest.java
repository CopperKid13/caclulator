import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionDoubleTest extends SetUp {

    @Test(dataProvider = "dataProviderForDivDouble")
    public void divisionDouble(double operand1, double operand2, double expectedResult) {
        double actualResult = calculator.div(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of dividing operation");
    }

    @DataProvider(name = "dataProviderForDivDouble")
    public Object[][] dataProviderForDivDouble() {
        return new Object[][]{
                {30, 12, 2.5},
                {18, 2.25, 8},
                {-30, 12, -2.5},
                {17.5, 5, 3.5}
        };

    }
}
