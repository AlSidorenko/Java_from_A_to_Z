package ru.job4j.arrays_6.multiplication_table_6_6;

/**
 * Created on 20.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Matrix {

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                table[row ][column] = (row + 1) * (column + 1);
            }
        }
        return table;
    }
}
