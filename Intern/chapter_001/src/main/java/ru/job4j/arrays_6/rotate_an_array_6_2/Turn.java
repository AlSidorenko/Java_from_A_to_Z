package ru.job4j.arrays_6.rotate_an_array_6_2;
/**
* Package for Array.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class Turn {
	/**
	 *Turn - mirror arrays_6.
	 *@param array - source arrays_6.
	 *@return - mirror arrays_6.
	 */
    public int[] back(int[] array) {
        int k;
        for (int i = 0; i < array.length / 2; i++) {
            k = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = k;
        }
        return array;
    }
}