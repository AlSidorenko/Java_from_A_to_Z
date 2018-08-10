package ru.job4j.cycle_5.factorial_5_2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 10.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FactorialTest {

    /**
     * Test - factorial 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int expected = factorial.calc(5);
        int result = 120;
        assertThat(expected, is(result));
    }

    /**
     * Test - factorial 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int expected = factorial.calc(0);
        int result = 1;
        assertThat(expected, is(result));
    }
}
