package ru.job4j.abstract_classes_7.exceptions;

/**
 * Created on 08.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MenuOutException extends RuntimeException {

    /**
     * Constructor.
     * @param message - param of String.
     */
    public MenuOutException(String message) {
        super(message);
    }
}
