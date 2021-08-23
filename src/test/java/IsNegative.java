import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

public class IsNegative {

    public static Calculator calculator;
    @BeforeClass
    public static void setUPJUnit() {
        calculator = new Calculator();
    }

    @org.junit.Test
    public void isNegativeZero() {
        boolean actualResult = calculator.isNegative(0);
        Assert.assertTrue(!actualResult, "Positive");
    }

    @org.junit.Test
    public void isNegativePositiveNumber() {
        boolean actualResult = calculator.isNegative(5);
        Assert.assertTrue(!actualResult, "Positive");
    }

    @Test
    public void isNegativeNegativeNumber() {
        boolean actualResult = calculator.isNegative(-10);
        Assert.assertTrue(actualResult, "Zero or negative");
    }

    @AfterClass
    public static void tearDownJUnit() {
        calculator = null;
    }
}
