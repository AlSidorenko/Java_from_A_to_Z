package ru.job4j.arrays_6.remove_duplicates_6_8;

import java.util.Arrays;

/**
* Package for Array.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class ArrayDuplicate {
	/**
	 *remove - remove elements of arrays_6.
	 *@param array - source arrays_6.
	 *@return - arrays_6.
	 */
    public String[] remove(String[] array) {
        int end = array.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (array[i] == array[j]) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        array[shiftLeft] = array[k];
                    }
                    end--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, end);
    }
}