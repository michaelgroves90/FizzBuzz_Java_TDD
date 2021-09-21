import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;
    
    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void testReturnsInputNumber() {
        assertEquals("2", fizzbuzz.run(2));
    }

    @Test
    public void testReturnsFizzWhenNumDivisibleBy3() {
        assertEquals("Fizz", fizzbuzz.run(3));
    }

    @Test
    public void testReturnsBuzzWhenNumDivisibleBy5() {
        assertEquals("Buzz", fizzbuzz.run(5));
    }

    @Test
    public void testReturnsFizzBuzzWhenNumDivisibleBy3and5() {
        assertEquals("FizzBuzz", fizzbuzz.run(15));
    }

}
