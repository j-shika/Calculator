import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class SciCalculatorTest {

    private static SciCalculator calculator;
    private static double DELTA = 1e-10;

    @BeforeClass
    public static void setup(){
        calculator = new SciCalculator();
    }

    @Test
    public void sqrtTruePositive(){
        assertEquals("Square root testing for True Positive", 4, calculator.SqaureRootFunc(16), DELTA);
        assertEquals("Square root testing for True Positive", 2.64575131106, calculator.SqaureRootFunc(7), DELTA);
        assertEquals("Square root testing for True Positive", 0, calculator.SqaureRootFunc(0), DELTA);
        assertEquals("Square root testing for True Positive", Double.NaN, calculator.SqaureRootFunc(-25), DELTA);
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("Square root testing for False Positive", 60, calculator.SqaureRootFunc(12), DELTA);
        assertNotEquals("Square root testing for False Positive", 5.30, calculator.SqaureRootFunc(3.08), DELTA);
        assertNotEquals("Square root testing for False Positive", 8.56 , calculator.SqaureRootFunc(-17), DELTA);
    }

    @Test
    public void natLogTruePositive(){
       //assertEquals("natural log testing for True Positive", 2.0, calculator.LogarithmFunc(10), DELTA);
        assertEquals("natural log testing for True Positive", 2.708050201102, calculator.LogarithmFunc(15), DELTA);
        assertEquals("natural log testing for True Positive", Double.NEGATIVE_INFINITY, calculator.LogarithmFunc(0), DELTA);
        assertEquals("natural log testing for True Positive", Double.NaN, calculator.LogarithmFunc(-89), DELTA);
    }

    @Test
    public void natLogFalsePositive(){
        assertNotEquals("natural log testing for False Positive", 18, calculator.LogarithmFunc(3), DELTA);
        assertNotEquals("natural log testing for False Positive", -7.3, calculator.LogarithmFunc(2.1), DELTA);
        assertNotEquals("natural log testing for True Positive", 0, calculator.LogarithmFunc(0), DELTA);
        assertNotEquals("natural log testing for True Positive", 8.9, calculator.LogarithmFunc(-25), DELTA);
    }

    @Test
    public void callPowerTruePositive(){
        assertEquals("Calculate Power testing for True Positive", 27, calculator.PowerFunc(3, 3), DELTA);
        //assertEquals("Calculate Power testing for True Positive", 1132.19575688, calculator.PowerFunc(4.2, 4.9), DELTA);
        assertEquals("Calculate Power testing for True Positive",Double.NaN, calculator.PowerFunc(0, 0), DELTA);
    }

    @Test
    public void callPowerFalsePositive(){
        assertNotEquals("Calculate Power testing for False Positive", 16, calculator.PowerFunc(2, 3), DELTA);
        assertNotEquals("Calculate Power testing for False Positive", 77.3, calculator.PowerFunc(2.1, 4.2), DELTA);
        assertNotEquals("Calculate Power testing for False Positive",0, calculator.PowerFunc(0, 0), DELTA);
    }

    @Test
    public void callFactorialTruePositive(){
        assertEquals("Calculate Factorial testing for True Positive", 24, calculator.Factorialfunc(4), DELTA);
        assertEquals("Calculate Factorial testing for True Positive", 1, calculator.Factorialfunc(1), DELTA);
        assertEquals("Calculate Factorial testing for True Positive",1, calculator.Factorialfunc(0), DELTA);
        assertEquals("Calculate Factorial testing for True Positive",Double.NaN, calculator.Factorialfunc(-535), DELTA);
    }

    @Test
    public void callFactorialFalsePositive(){
        assertNotEquals("Calculate Factorial for False Positive", 26, calculator.Factorialfunc(12), DELTA);
        //assertNotEquals("Calculate Factorial for False Positive", 7.3, calculator.callFact(2.1), DELTA);
        assertNotEquals("Calculate Factorial for False Positive",12, calculator.Factorialfunc(0), DELTA);
        assertNotEquals("Calculate Factorial for False Positive",655, calculator.Factorialfunc(-154), DELTA);
    }

}

