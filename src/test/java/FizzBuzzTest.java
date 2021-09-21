import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Test
    public void testReturnsInputNumber() {
        fizzbuzz = new FizzBuzz(2);
        assertEquals("2", fizzbuzz.run());
    }


}
