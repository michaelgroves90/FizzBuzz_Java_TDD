import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Test
    public void testReturnsInputNumber() {
        fizzbuzz = new FizzBuzz(2);
        assertEquals("2", fizzbuzz.run());
    }

    @Test
    public void testReturnsFizzWhenNumDivisibleBy3() {
        fizzbuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzbuzz.run());
    }

    @Test
    public void testReturnsBuzzWhenNumDivisibleBy5() {
        fizzbuzz = new FizzBuzz(5);
        assertEquals("Buzz", fizzbuzz.run());
    }


}
