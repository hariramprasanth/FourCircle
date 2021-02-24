import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialOfNumberTest
{
    @Test
    void shouldReturnFactorialOfNumber()
    {
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber(5);
        int result=factorialOfNumber.fact();
        assertEquals(120,result);
    }

    @Test
    void shouldReturnOneIfNumberIsZero() {
        FactorialOfNumber factorialOfNumber=new FactorialOfNumber(0);
        int result=factorialOfNumber.fact();
        assertEquals(1,result);
    }

    @Test
    void shouldReturnNegativeOneIfNumberIsNegative() {
        FactorialOfNumber factorialOfNumber=new FactorialOfNumber(-5);
        int result=factorialOfNumber.fact();
        assertEquals(-1,result);
    }
}
