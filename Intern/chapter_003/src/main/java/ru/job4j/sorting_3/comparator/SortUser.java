package ru.job4j.sorting_3.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created on 05.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SortUser {

    /**
     * Method sorting_3 by name length.
     *
     * @param users - list.
     * @return - sorting_3 list.
     */
    public List<User> sortNameLength(List<User> users) {
        List<User> sorting = new ArrayList<>();
        sorting.addAll(users);
        sorting.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        });
        return sorting;
    }

    /**
     * Method sorting_3 by all fields.
     *
     * @param users - list.
     * @return - sorting_3 list.
     */
    public List<User> sortByAllFields(List<User> users) {
        List<User> sorting = new ArrayList<>();
        sorting.addAll(users);
        sorting.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = o1.getName().compareTo(o2.getName());
                return result != 0 ? result : Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return sorting;
    }
}