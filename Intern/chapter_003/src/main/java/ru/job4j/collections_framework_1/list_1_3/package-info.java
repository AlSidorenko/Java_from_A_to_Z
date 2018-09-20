/**
 * Created on 26.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.collections_framework_1.list_1_3;

/*
Конвертация ArrayList в двухмерный массив [#10035]
  Каретко Виктор,  06.04.18 10:09
Вам необходимо создать класс
ConvertList2Array
Внутри методов использовать foreach.

public int[][] toArray (List<Integer> list, int rows) {} - метод toArray должен равномерно разбить лист на количество строк двумерного массива. В методе toArray должна быть проверка - если количество элементов не кратно количеству строк - оставшиеся значения в массиве заполнять нулями.

Например в результате конвертации листа со значениями (1,2,3,4,5,6,7)
с разбиением на 3 строки должен получиться двумерный массив {{1, 2, 3} {4, 5, 6} {7, 0 ,0}}

Шаблон класса.

package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = ... ;
        int[][] array = new int[rows][cells];
        return array;
    }
}

Шаблон теста.

package ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0 ,0}
        };
        assertThat(result, is(expect));
    }
}

 */