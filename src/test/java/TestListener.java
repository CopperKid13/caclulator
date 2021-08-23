import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("on Test Start:" + result.getName() + result.getParameters());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("on Test Success:" + result.getName() + result.getParameters());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("on Test Failed:" + result.getName() + result.getParameters());
    }
}
