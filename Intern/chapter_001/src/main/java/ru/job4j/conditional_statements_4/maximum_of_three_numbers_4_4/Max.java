package ru.job4j.conditional_statements_4.maximum_of_three_numbers_4_4;

/**
 * Created on 08.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Max {

    /**
     * Method for determining a larger number.
     *
     * @param first  - first number.
     * @param second - second number.
     * @return - result max.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    /**
     * Method for determining a larger number.
     *
     * @param first - first elem.
     * @param second - second elem.
     * @param third - third elem.
     * @return
     */
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        return this.max(temp, third);
    }
}
