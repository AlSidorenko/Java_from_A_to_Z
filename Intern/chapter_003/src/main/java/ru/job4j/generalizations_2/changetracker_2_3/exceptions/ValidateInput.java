package ru.job4j.generalizations_2.changetracker_2_3.exceptions;

import java.util.List;

/**
 * Created on 08.12.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ValidateInput extends ConsoleInput {

    @Override
    public Integer ask(String question, List<Integer> range) {
        boolean invalid = true;
        Integer value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please, select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please, enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}

