package tests.Cross;

import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class CrossTest01 extends TestBaseCross {

    @Test
    public void test1() {
        driver.get("https://amazon.com");
        driver.get("https://facebook.com");
    }
}
