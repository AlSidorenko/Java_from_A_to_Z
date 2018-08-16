/**
 * Created on 15.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.arrays_6.array_filling_6_3;

/*
6.3. Массив заполнен true или false [#53857]
  Петр Арсентьев,  05.07.18 4:49
Требования к задаче:
1. Необходимо создать класс Check;
2. В классе Check написать метод public boolean mono(boolean[] data)

package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
//        for () {
//        }
        return result;
    }
}


3. Метод должен проверить, что все элементы в массиве являются true или false.

Например.
{true, true, true} - вернет true;
{true, false, true} - вернет false;
{false, false, false} - вернет true;

4. В задании нельзя использовать дополнительный массив.
5. В классе CheckTest напишите 2 тест-метода, которые будет проверять вашу программу для чётного и нечётного количества элементов в массиве.
6. В тестах можно сразу проверять целиком массив через метод assertThat(resultArray, is(expectArray));
7. Класс Check должен находиться в chapter_001\src\main\java\ru\job4j\array\Check.java;
8. Тест-класс CheckTest должен находиться в chapter_001\src\test\java\ru\job4j\array\CheckTest.java;

Типовые ошибки:
"Выходит ошибка ArrayIndexOutOfBoundsException" - вы обращаетесь к элементу за пределами массива. Первый элемент массива имеет индекс 0, поэтому попытка обратиться к последнему элементу массива через array[array.length] будет всегда выбрасывать исключение. Например массив {0, 1} имеет длину 2, но последний элемент массива имеет индекс 1.
Каркас тест-класса:
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
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