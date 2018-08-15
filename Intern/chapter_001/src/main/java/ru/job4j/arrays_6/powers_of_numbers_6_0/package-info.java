/**
 * Created on 15.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.arrays_6.powers_of_numbers_6_0;

/*
6.0. Заполнить массив степенями чисел. [#33488]
  Администратор,  02.06.18 4:35
Необходимо создать программу, которая будет заполнять массив числами возведенными в квадрат.

1. Создайте класс по пути chapter_001/src/main/java/ru/job4j/array/Square.java

2. Добавьте в него метод

package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }
}
3. Напишите тесты на полученные метод.

package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }
}

Важно.
assertThat(rst, is(expect)); - мы сравниваем целиком массивы, а не отдельные числа.


4. Добавьте еще несколько тест методов в тест класс.

Задание.

1. В папке со своим именем создайте задачу c именем этой задачи.
2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
4. Переходите к следующей задаче.
 */