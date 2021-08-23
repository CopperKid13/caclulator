import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationIntegerTest extends SetUp {

    @Test(dataProvider = "dataProviderForMultInteger")
    public void multiplicationInteger(long operand1, long operand2, long expectedResult) {
        long actualResult = calculator.mult(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of multiplication operation");
    }

    @DataProvider(name = "dataProviderForMultInteger")
    public Object[][] dataProviderForMultInteger() {
        return new Object[][]{
                {2, 1, 2},
                {2, 2, 4},
                {2, 0, 0},
                {2, -2, -4},
                {-2, -2, 4}
        };
    }
}
