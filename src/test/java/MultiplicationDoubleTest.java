import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationDoubleTest extends SetUp {

    @Test(dataProvider = "dataProviderForMultDouble")
    public void multiplicationDouble(double operand1, double operand2, double expectedResult) {
        double actualResult = calculator.mult(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of multiplication operation");
    }

    @DataProvider(name = "dataProviderForMultDouble")
    public Object[][] dataProviderForMultDouble() {
        return new Object[][]{
                {2, 1.5, 3},
                {2.25, 3.75, 8.4375},
                {12, 0.75, 9},
                {2, -2.2, -4.4},
                {-2, -2.2, 4.4}
        };
    }
}
