/**
 * Created on 20.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.collections_framework_1.queue_1_2;

/*
2. Очередь с приоритетом на LinkedList [#41670]
  Петр Арсентьев,  17.02.18 7:20
Одна из удобных структур данных является очередь с приоритетами.

По сути это обычный связанный список. но при добавлении нового элемента. мы должны его расположить в нужную позиции.

Например. У нас есть список задач на день и в какой то момент времени. мы понимаем. что нам нужный выполнить более важные задачи.

Мы меняем свой список, так. что бы наиболее важные задачи стояли сначала.

Давайте с Вами напишем каркас очереди с приоритетами.

package ru.job4j.search;

public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}

package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
/*public void put(Task task) {
        //TODO добавить вставку в связанный список.
        }

public Task take() {
        return this.tasks.poll();
        }
        }

        И давайте запишем тест.

        package ru.job4j.search;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}

Задание.

        1. Доработайте требуемый функционал.
        2. Залейте код в репозиторий.
        3. Создайте задачу в своей папке с имением. 2. Очередь с приоритетом на LinkedList
        4. Выставите ответственного Петр Арсентьева.

 */