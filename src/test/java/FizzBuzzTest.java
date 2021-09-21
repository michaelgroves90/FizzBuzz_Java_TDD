import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Test
    public void testReturnsInputNumber() {
        fizzbuzz = new FizzBuzz();
        assertEquals("2", fizzbuzz.run(2));
    }

    @Test
    public void testReturnsFizzWhenNumDivisibleBy3() {
        fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.run(3));
    }

    @Test
    public void testReturnsBuzzWhenNumDivisibleBy5() {
        fizzbuzz = new FizzBuzz();
        assertEquals("Buzz", fizzbuzz.run(5));
    }

    @Test
    public void testReturnsFizzBuzzWhenNumDivisibleBy3and5() {
        fizzbuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzbuzz.run(15));
    }

}
