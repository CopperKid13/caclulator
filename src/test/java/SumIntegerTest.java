import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumIntegerTest extends SetUp {

    @Test(dataProvider = "dataProviderForSumInteger")
    public void sumInteger(long operand1, long operand2, long expectedResult) {
        long actualResult = calculator.sum(operand1, operand2);
        Assert.assertEquals(actualResult, expectedResult, "Incorrect result of sum operation");
    }

    @DataProvider(name = "dataProviderForSumInteger")
    public Object[][] dataProviderForSumInteger() {
        return new Object[][]{
                {50, 65, 115},
                {5, -6, -1},
                {-2, -4, -6},
                {1, 0, 1},
                {0, 0, 0}
        };
    }

}
