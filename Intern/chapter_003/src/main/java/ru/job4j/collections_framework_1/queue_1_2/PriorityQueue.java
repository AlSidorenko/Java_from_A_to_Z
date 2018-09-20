package ru.job4j.collections_framework_1.queue_1_2;

import java.util.LinkedList;

/**
 * Created on 20.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PriorityQueue {

    /**
     * Linked list_1_3.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     *
     * @param task задача.
     */
    public void put(Task task) {
        if (tasks.size() == 0) {
            tasks.add(task);
        }

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() > task.getPriority()) {
                tasks.add(i, task);
                break;
            }
        }
    }

    /**
     *
     * @return - result.
     */
    public Task take() {
        return this.tasks.poll();
    }
}
