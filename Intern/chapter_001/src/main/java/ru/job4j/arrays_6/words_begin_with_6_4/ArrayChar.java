package ru.job4j.arrays_6.words_begin_with_6_4;

/**
 * Created on 16.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ArrayChar {

    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = false;
        char[] value = prefix.toCharArray();
        int originLength = data.length;
        int subLength = value.length;
        if (subLength <= originLength) {
            for (int i = 0; !result && i < originLength - subLength + 1; i++) {
                int j = 0;
                while (j < subLength && data[i + j] == value[j]) {
                    j++;
                }
                result = j == subLength;
            }
        }
        return result;
    }
}
