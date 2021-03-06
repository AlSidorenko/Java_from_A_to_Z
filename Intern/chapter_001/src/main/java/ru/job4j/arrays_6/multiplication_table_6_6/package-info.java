/**
 * Created on 20.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.arrays_6.multiplication_table_6_6;

/*
6.6. Двухмерный массив. Таблица умножения. [#33491]
  Администратор,  02.06.18 4:36
Двухмерный массив - это массив в котором ячейки массива являются другие массивы.

Запись двухмерного массива.

int[][] data = new int[10][10];

Для того, чтобы обратиться к элементу массива нам нужно использовать два индекса.

Например, запишем в ячейку с индексами 0 0

data[0][0] = 4;

Считывания элемента из массива аналогично запиши происходит по двум индексам.

int value = data[0][0];

Особенность двухмерного массива. Если количество ячеек равно количеству элементов во вложенном массиве, то такой массив называется матрицей.

Матрицу можно представить в виде обычной таблицы.



Задание.

1. Создаем класс chpater_001/src/main/java/ru/job4j/array/Matrix.java

2. Реализуйте метод int[][] multiple(int size)

size - указывает на размер таблицы. В элементах таблицы вам нужно записать элементы таблицы умножения.

Элементы получать перемножением индексов.

Например. если size = 9. У вас должна получиться таблица представленная ниже.



Помните. что первая ячейка индекса начинается с 0. Это нужно учитывать при заполении таблицы.

3. Напишите тесты проверяющее поведение этого метода.

Шаблон класса

package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        return table;
    }
}

Шаблон для теста.

package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}

Задание.

1. В папке со своим именем создайте задачу c именем этой задачи.
2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
4. Переходите к следующей задаче.

 */