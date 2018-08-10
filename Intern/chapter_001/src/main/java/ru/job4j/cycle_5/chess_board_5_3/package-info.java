/**
 * Created on 10.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.cycle_5.chess_board_5_3;

/*
5.3. Построить шахматную доску в псевдографике. [#13559]
  Петр Арсентьев,  20.06.18 5:36
Требования к задаче:
* Перед выполнение задания прочитайте про StringBuilder в книге Брюса Эккеля, Философия Java. Глава 13 (стр. 414 - 418)

1. Необходимо создать класс Board;
2. В классе Board написать метод public String paint(int width, int height), который должен рисовать шахматную доску из символов x и пробелов;
3. width - это ширина доски, height - это высота доски;
4. Для сложения строк использовать класс StringBuilder и методы append(String), String toString().
5. Класс Board должен находиться в chapter_001\src\main\java\ru\job4j\loop\Board.java;
6. Тест-класс BoardTest должен находиться в chapter_001\src\test\java\ru\job4j\loop\BoardTest.java;
7. В классе BoardTest напишите 2 тест-метода, которые будут проверять вашу программу.
Пример:
Для доски 3 на 3 вид:
Х	 	Х
 	Х
Х	 	Х
Для доски 5 на 4 вид:
Х	 	Х	 	Х
 	Х	 	Х
Х	 	Х	 	Х
 	Х	 	Х

Давайте нарисуем доску с указанием индексов.


Далее проанализируем, какие индексы попадаются на крестики.



Как мы видим получаемая последовательность имеет закономерность.
Сумма индексов всегда четное число (число делиться на 2 без остатка). Эту закономерность мы будет использовать при построении программы.

Давайте напишем каркас.

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for ( ) {
            for ( ) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if () {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}


И тест.

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }
}

String.format("X X%s X %sX X%s", ln, ln, ln) - String.format позволяет использовать маркеры, в которые можно вставить переменные.

        Например.

        String name = "Petr";
        System.out.println(String.format("Hello, %s", name)); - выведет на печать Hello, Petr

        Это нужно, чтобы избавиться от складывания строк, что приводит к не нужному увеличению памяти.

        Маркеры - %s - заполнить строкой. %d - заполнить числом.

        Подробно https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
        Объяснение:
        1. В этой задаче вам необходимо сформировать доску в виде строки без вывода в консоль.
        2. Здесь должно быть 2 цикла - внешний отвечает за высоту доски, вложенный отвечает за ширину доски.
        3. Внутри вложенного цикла необходимо написать условия прорисовки клеток доски (x и пробелы).
        4. Высота доски достигается за счёт переходов на новую линию. В Windows это "\r\n", в Linux - "\n". Универсальный вариант который вам необходимо использовать System.getProperty("line.separator") - автоматически определяет переход в зависимости от ОС.
        5. Класс StringBuilder служит для построения строки, метод append добавляет символы и строки в некоторый буфер StringBuilder-а, вместо вывода на консоль. При вызове метода toString для StringBuilder - он возвращает все добавленные в него символы и строки в одну строку.
        Типовые ошибки:
        1. "Программа ничего не выводит в консоль" - при записи символов в StringBuilder программа и не должна рисовать пирамиду в консоли. Если вы хотите посмотреть, как визуально выглядит ваша пирамида - вы можете вывести строку, сформированную методом, в консоль.
        2. "Пирамиду рисует правильно, но тест не проходит" - обратите пристальное внимание на пробелы, переходы на новую линию, возможно у вас есть лишние;

        Каркас тест-класса:
        package ru.job4j.loop;

        import org.junit.Test;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //напишите здесь тест, проверяющий формирование доски 5 на 4.
    }
}
    Что не нужно делать:
        1. Здесь не надо использовать Scanner, System.in, System.out.println.
        2. В программе не должно быть ввода и вывода данных.
        3. Не надо создавать метод public static void main(String[] args) - так вы занимаетесь ручным тестированием. В курсе используется только автоматическое тестирование за счет JUnit.
        4. В классах не надо добавлять методы get set.

        Задание.

        1. В папке со своим именем создайте задачу c именем этой задачи.
        2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
        3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
        4. Переходите к следующей задаче.
 */