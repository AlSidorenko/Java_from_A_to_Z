package ru.job4j.arrays_6.powers_of_numbers_6_0;

/**
 * Created on 15.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Square {

    /**
     * Method squaring.
     * @param bound - amount of elements.
     * @return - array squaring.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = (int) Math.pow(i, 2);
        }
        return rst;
    }
}
