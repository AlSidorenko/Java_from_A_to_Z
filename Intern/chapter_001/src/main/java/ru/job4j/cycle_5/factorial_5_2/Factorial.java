package ru.job4j.cycle_5.factorial_5_2;

/**
 * Created on 10.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Factorial {

    /**
     * Calculation of factorial.
     * @param n - item.
     * @return - result.
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
