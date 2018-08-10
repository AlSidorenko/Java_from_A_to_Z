/**
 * Created on 10.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.cycle_5.factorial_5_2;

/*
5.2. Создать программу вычисляющую факториал.
 Администратор, 10.03.17 16:41 [#193]
Требования к задаче:
1. Необходимо создать класс Factorial;
2. В классе Factorial написать метод public int calc(int n) {};
3. В качестве аргумента в метод приходит положительное целое число n, сам метод должен возвращать рассчитанный факториал для этого числа;
4. Класс Factorial должен находиться в chapter_001\src\main\java\ru\job4j\loop\Factorial.java;
5. Тест-класс FactorialTest должен находиться в chapter_001\src\test\java\ru\job4j\loop\FactorialTest.java;
6. В классе FactorialTest напишите 2 тест-метода, которые будет проверять вашу программу.
Пример:
Факториал для числа 5 будет равен 120 (1 * 2 * 3 * 4 * 5).
Факториал для числа 0 равен 1

Подсказки к задаче (нажмите, чтобы развернуть):
Объяснение:
1. Вы должны, используя цикл for, пройтись от 1 до n и перемножить эти числа.
2. Факториал для 0 должен возвращать единицу.
Типовые ошибки:
1. "Метод возвращает 0 для всех n" - вы начинаете цикл for от 0. Таким образом при умножении всех чисел на 0 результат всегда будет 0.
2. "Метод считает не верно, для 5 возвращает число 24" - в логическом выражении цикла for вы не включаете последнее значение;
Каркас тест-класса:
package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}
Что не нужно делать:
1. Здесь не надо использовать Scanner, System.in, System.out.println.
2. В программе не должно быть ввода и вывода данных.
3. Не надо создавать метод public static void main(String[] args) - так вы занимаетесь ручным тестированием. В курсе используется только автоматическое тестирование за счет JUnit.
4. В классах не надо добавлять методы get set.
 */