package ru.job4j.exceptions_6;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public interface Input {

    /**
     * @param question - param of method interface.
     * @return - string.
     */
    String ask(String question);

    /**
     * @param question - param of method interface.
     * @param range - param of method interface.
     * @return - int result.
     */
    int ask(String question, int[] range);
}
