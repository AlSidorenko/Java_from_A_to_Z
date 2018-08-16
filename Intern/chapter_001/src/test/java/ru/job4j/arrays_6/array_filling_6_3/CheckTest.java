package ru.job4j.arrays_6.array_filling_6_3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 15.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CheckTest {

    /**
     * Test mono by True.
     * result - true.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test mono by False.
     * result - true.
     */
    @Test
    public void whenDataMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test not Mono.
     * result - false.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
