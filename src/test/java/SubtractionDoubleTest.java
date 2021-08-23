import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionDoubleTest extends SetUp {


    @Test(dataProvider = "dataProviderForSubDouble")
    public void subtractionDouble(double operand1, double operand2, double expectedResult) {
        double actualResult = calculator.sub(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of subtraction operation");
    }

    @DataProvider(name = "dataProviderForSubDouble")
    public Object[][] dataProviderForSubDouble() {
        return new Object[][]{
                {6.99, 1, 5.99},
                {5.09, 0.03, 5.06},
                {5, -6.75, 11.75},
                {-2.01, -0.99, -1.02}

        };
    }
}
