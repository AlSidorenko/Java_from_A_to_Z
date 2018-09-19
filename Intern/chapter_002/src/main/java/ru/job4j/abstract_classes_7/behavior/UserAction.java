package ru.job4j.abstract_classes_7.behavior;

import ru.job4j.abstract_classes_7.input.Input;
import ru.job4j.abstract_classes_7.models.Tracker;

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
    int key();

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
