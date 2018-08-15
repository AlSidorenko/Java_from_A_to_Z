/**
 * Created on 15.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.arrays_6.search_for_items_6_1;

/*
6.1. Классический поиск перебором. [#33489]
  Администратор,  02.06.18 4:35
Одной из важных задач в программировании является поиск данных.

В этой задаче мы познакомимся с классическим способом поиска элемента в массиве.

Способ действительно очень простой. У нас задан массив элементов. Нам необходимо найти индекс элемента удовлетворяющий условию.

Решение этой задачи сводится в последовательному перебору каждого элемента. Если элемент подходит под условие, мы останавливаем цикл и возвращаем индекс нашего элемента.

Задание.

1. Создайте класс по адресу chapter_001/src/main/java/array/FindLoop.java

2. Реализуйте метод поиска элемента в массиве. Метод должен вернуть индекс элемента.

package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (...) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
3. Напишите минимум два тест метода, один метод находит элемент, а другой нет.

package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHasLength5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}


Задание.

1. В папке со своим именем создайте задачу c именем этой задачи.
2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
4. Переходите к следующей задаче.
 */