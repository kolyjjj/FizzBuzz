package koly.li;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_empty_string_when_input_is_1() throws Exception {
        assertThat(fizzBuzz.yunxing(1), is(""));
    }

    @Test
    public void should_return_fizz_when_input_is_divisible_by_3() throws Exception {
        assertThat(fizzBuzz.yunxing(3), is("Fizz"));
    }

    @Test
    public void should_return_fizz_when_input_is_divisible_by_6() throws Exception {
        assertThat(fizzBuzz.yunxing(3), is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_input_is_divisible_by_5() throws Exception {
        assertThat(fizzBuzz.yunxing(10), is("Buzz"));
    }
    @Test
    public void should_return_fizzbuzz_when_input_is_divisible_both_by_3_and_5() throws Exception {
        assertThat(fizzBuzz.yunxing(15), is("FizzBuzz"));
    }
}
