import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setSumCalculator(){
        calculator = new SumCalculator();
    }

    @Test
    public void testSumFor1(){
        assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testSumFor3(){
        assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSumFor0(){
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}