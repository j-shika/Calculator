import org.junit.Assert;
import org.junit.Test;
public class SciCalculatorTest {
    private SciCalculator obj;

    public SciCalculatorTest() {
        obj = new SciCalculator();
    }

    @Test
    public void sqrt(){
        int num = 25;
        double expectedResult = 5.0;
        double result = obj.sqrt(num);
        Assert.assertEquals(expectedResult, result,0);
    }
}
