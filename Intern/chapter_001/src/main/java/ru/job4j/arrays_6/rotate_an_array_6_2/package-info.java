/**
 * Created on 15.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.arrays_6.rotate_an_array_6_2;

/*
6.2. Перевернуть массив. [#4441]
  Петр Арсентьев,  20.06.18 6:02
Требования к задаче:
1. Необходимо создать класс Turn;
2. В классе Turn написать метод public int[] back(int[] array)

package ru.job4j.array;

public class Turn {
    public int[] turn(int[] array) {
        for () {
        }
        return array;
    }
}

3. Метод должен перевернуть массив задом наперёд
4. В задании нельзя использовать дополнительный массив.
5. В классе TurnTest напишите 2 тест-метода, которые будет проверять вашу программу для чётного и нечётного количества элементов в массиве.
6. В тестах можно сразу проверять целиком массив через метод assertThat(resultArray, is(expectArray));
7. Класс Turn должен находиться в chapter_001\src\main\java\ru\job4j\array\Turn.java;
8. Тест-класс TurnTest должен находиться в chapter_001\src\test\java\ru\job4j\array\TurnTest.java;

Схема алгоритма.

1. Получить первый элемент заменить с последним через временную переменную.
2. Проделать тоже самое с элементами index -> data.size - index - 1



Пример:
Массив {1, 2, 3, 4, 5} после переворота должен получиться {5, 4, 3, 2, 1}
Массив {4, 1, 6, 2} после переворота должен получиться {2, 6, 1, 4}

Объяснение:
1. Вам необходимо реализовать метод back, который принимает в себя массив целых чисел, а возвращает тот же самый массив, но перевёрнутый задом наперёд.
2. Используйте цикл for для обращения к элементам массива.
3. Используйте метод .length - он возвращает длину массива.
4. Подумайте имеет ли смысл проходить до конца массива, если вам нужно поменять начальные элементы с конечными.
Типовые ошибки:
"Выходит ошибка ArrayOutOfIndexException" - вы обращаетесь к элементу за пределами массива. Первый элемент массива имеет индекс 0, поэтому попытка обратиться к последнему элементу массива через array[array.length] будет всегда выбрасывать исключение. Например массив {0, 1} имеет длину 2, но последний элемент массива имеет индекс 1.
Каркас тест-класса:
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.turn(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
    }
}
Что не нужно делать:
1. Здесь не надо использовать Scanner, System.in, System.out.println.
2. В программе не должно быть ввода и вывода данных.
3. Не надо создавать метод public static void main(String[] args) - так вы занимаетесь ручным тестированием. В курсе используется только автоматическое тестирование за счет JUnit.
4. В классах не надо добавлять методы get set.
5. В тест-классе не надо проверять через цикл каждую ячейку.

Задание.

1. В папке со своим именем создайте задачу c именем этой задачи.
2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
4. Переходите к следующей задаче.
 */