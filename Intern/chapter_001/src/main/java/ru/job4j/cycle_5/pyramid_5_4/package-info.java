/**
 * Created on 10.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.cycle_5.pyramid_5_4;

/*
5.4. Построить пирамиду в псевдографике. [#4412]
  Петр Арсентьев,  20.06.18 5:31
Требования к задаче:
1. Необходимо создать класс Paint;
2. В классе Paint написать метод public String piramid(int h), который должен рисовать пирамиду из символа ^ и пробелов;
3. h - это высота пирамиды;
4. Для сложения строк использовать класс StringBuilder - и методы append(String), String toString().
5. Класс Paint должен находиться в chapter_001\src\main\java\ru\job4j\loop\Paint.java;
6. Тест-класс PaintTest должен находиться в chapter_001\src\test\java\ru\job4j\loop\PaintTest.java;
7. В классе PaintTest напишите 2 тест-метода, которые будет проверять вашу программу.
Пример:
Для высоты 2 пирамида будет иметь вид:
 	^
^	^	^
Для высоты 3 пирамида будет иметь вид
 	 	^
 	^	^	^
^	^	^	^	^

Пропуски(пробелы) между ^^ делать не надо.

Объяснение:
1. В этой задаче вам необходимо сформировать пирамиду в виде строки без вывода в консоль.
2. Здесь должно быть 2 цикла - внешний отвечает за высоту пирамиды, вложенный отвечает за ширину пирамиды.
3. Внутри вложенного цикла необходимо написать условия прорисовки пирамиды.
4. Высота пирамиды достигается за счёт переходов на новую линию. В Windows это "\r\n", в Linux - "\n".
Универсальный вариант который вам необходимо использовать System.getProperty("line.separator") - автоматически
 определяет переход в зависимости от ОС.
5. Класс StringBuilder служит для построения строки, метод append добавляет символы и строки в некоторый
буфер StringBuilder-а, вместо вывода на консоль. При вызове метода toString для
StringBuilder - он возвращает все добавленные в него символы и строки в одну строку.

Решение этой задачи сводится к решению двух подзадач.
Если мы нарисуем пирамиду на сетке.


То решение задачи сводиться к закрашиванию квадрата по диагонали

С правой стороны.


И с левой.



И объединить эти два решения.

Давайте реализуем правосторонний треугольник.

package ru.job4j.loop;

/**
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class Paint {
    public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }
}
    Теперь давайте напишем тест.
        В тесте мы добавим вывод в консоль, чтобы посмотреть наш результат. В промышленных программах так делать не рекомендуется, потому что это увеличивает время исполнения теста. Мы это делаем в качестве наглядности в обучающих целях.

        package ru.job4j.loop;

        import org.junit.Test;
        import java.util.StringJoiner;
        import static org.hamcrest.Matchers.is;
        import static org.junit.Assert.*;

/**
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class PaintTest {
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }
}

    Обратите особое внимание. Здесь мы используем новый класс StringJoiner.

        Обязательно проверьте, что Вы импортировали его в заголовок.
        import java.util.StringJoiner;
        Это класс выполняет такие же задачи, как и класс StringBuilder, но он имеет более удобный интерфейс использования.

        В частности, мы можем указать один раз, какой использовать разделитель между строками.

        И давайте запустим его.




        Как мы видим тест выполнился успешно, а так же мы видим вывод в консоли нашего результата.

        System.out.println(rst);

        Давайте теперь напишем вторую подзадачу. вывести левою сторону пирамиды.

        Код будет выглядеть одинаково за исключением условия.

public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
        for (int column = 0; column != weight; column++) {
        if (row >= weight - column - 1) {
        screen.append("^");
        } else {
        screen.append(" ");
        }
        }
        screen.append(System.lineSeparator());
        }
        return screen.toString();
        }

        Давайте разберемся, почему у нас такое условие.
        if (row >= weight - column - 1) {

        Если мы посмотрим на картинку 2. то мы должны выставлять галки с конца.

        для этого мы должна брать ширину всей строки и вычитать текущий указатель на ячейку.

        Так же, мы берем - 1 потому, что элементы в массиве начинаются с 0, а не с 1.

        Точно так же давайте напишем тест.

@Test
public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
        is(
        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
        .add("   ^")
        .add("  ^^")
        .add(" ^^^")
        .add("^^^^")
        .toString()
        )
        );
        }



        Теперь осталось реализовать конечный вариант пирамиды.

        По схеме реализации он будет идентичный.

        Отличие будет только в условии.

        Здесь нам надо объединить два условия вместе через оператор &&
public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
        for (int column = 0; column != weight; column++) {
        if (row >= height - column - 1 && row + height - 1 >= column) {
        screen.append("^");
        } else {
        screen.append(" ");
        }
        }
        screen.append(System.lineSeparator());
        }
        return screen.toString();
        }
        Типовые ошибки:
        1. "Программа ничего не выводит в консоль" - при записи символов в StringBuilder программа и не должна рисовать пирамиду в консоли. Если вы хотите посмотреть, как визуально выглядит ваша пирамида - вы можете вывести строку, сформированную методом, в консоль.
        2. "Пирамиду рисует правильно, но тест не проходит" - обратите пристальное внимание на пробелы, переходы на новую линию, возможно у вас есть лишние;

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