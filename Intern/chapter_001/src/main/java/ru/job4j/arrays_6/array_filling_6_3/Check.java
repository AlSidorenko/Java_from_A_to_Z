package ru.job4j.arrays_6.array_filling_6_3;

/**
 * Created on 15.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Check {

    /**
     * Method - boolean array.
     * @param data - array.
     * @return - boolean.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result = true;
            }
        }
        return result;
    }
}
