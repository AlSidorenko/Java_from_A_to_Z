/**
 * Created on 16.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.arrays_6.words_begin_with_6_4;

/*
6.4. Слова начинается с ... [#41585]
  Петр Арсентьев,  02.06.18 4:35
В АПИ класса String есть метод startWith. Этот метод проверяет, что слова начинается в определенной последовательности.

Например.

Привет - При - true

Привет - Пре - false.

Вашей задачей в этом задании будет реализация этого метода.

Давайте создадим каркас класс и напишем сразу тесты.

package ru.job4j.array;

/**
 * Обертка над строкой.
 */
/*public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    /*public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        return result;
    }
}

package ru.job4j.array;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}
 Задание.

         1. Доработайте требуемый функционал.
         2. Залейте код в репозиторий.
         3. Создайте задачу в своей папке с имением. 5.5. Слова начинается с ...
         4. Выставите ответственного Петр Арсентьева.
 */