import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new TestListener());
        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./scr/test/java/resources/testng.xml"));
        suite.setParallel(XmlSuite.ParallelMode.TESTS);
        suite.setThreadCount(2);
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
