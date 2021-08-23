import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;

public class IsPositiveTest {

    public static Calculator calculator;
    @BeforeClass
    public static void setUPJUnit() {
        calculator = new Calculator();
    }


    @org.junit.Test
    public void isPositiveZero() {
        boolean actualResult = calculator.isPositive(0);
        Assert.assertTrue(!actualResult, "Zero or negative");
    }

    @org.junit.Test
    public void isPositiveNegativeNumber() {
        boolean actualResult = calculator.isPositive(-5);
        Assert.assertTrue(!actualResult, "Zero or negative");
    }

    @Test
    public void isPositivePositiveNumber() {
        boolean actualResult = calculator.isPositive(10);
        Assert.assertTrue(actualResult, "Zero or negative");
    }
    @AfterClass
    public static void tearDownJUnit() {
        calculator = null;
    }


}

