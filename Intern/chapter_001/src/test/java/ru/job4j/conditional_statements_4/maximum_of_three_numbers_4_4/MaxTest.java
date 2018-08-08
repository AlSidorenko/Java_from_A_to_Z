package ru.job4j.conditional_statements_4.maximum_of_three_numbers_4_4;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 08.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MaxTest {

    /**
     * Test first item less second item.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Test first item less second item or third item.
     */
    @Test
    public void whenFirstLessSecondOrThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
}
