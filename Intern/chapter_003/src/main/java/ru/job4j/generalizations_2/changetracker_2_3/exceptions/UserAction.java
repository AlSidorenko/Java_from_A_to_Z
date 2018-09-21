package ru.job4j.generalizations_2.changetracker_2_3.exceptions;

/**
 * Created on 04.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public interface UserAction {

    /**
     * Method key.
     * @return int.
     */
    Integer key();

    /**
     * Method execute.
     * @param input - param of Interface.
     * @param tracker - param of Class Tracker.
     */
    void execute(Input input, Tracker tracker);

    /**
     * Method information.
     * @return - string value.
     */
    String info();
}