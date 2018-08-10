package ru.job4j.cycle_5.sum_of_even_numbers_5_1;

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
public class CounterTest {

    /**
     * Test sum of even numbers.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int expected = counter.add(0, 10);
        int result = 30;
        assertThat(expected, is(result));
    }
}
