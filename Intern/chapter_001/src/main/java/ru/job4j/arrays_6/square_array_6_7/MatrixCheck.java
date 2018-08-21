package ru.job4j.arrays_6.square_array_6_7;

/**
 * Created on 20.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        boolean result;
        if (((data[0][0] == data[1][1]) & (data[1][1] == data[2][2]))
                | ((data[0][2] == data[1][1]) & (data[1][1] == data[2][0]))) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
