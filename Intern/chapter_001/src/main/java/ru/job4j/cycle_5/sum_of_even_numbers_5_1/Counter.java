package ru.job4j.cycle_5.sum_of_even_numbers_5_1;

/**
 * Created on 10.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Counter {

    /**
     * Method sum of even numbers.
     * @param start - start item.
     * @param finish - finish item.
     * @return - result sum.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if ((i % 2) == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
