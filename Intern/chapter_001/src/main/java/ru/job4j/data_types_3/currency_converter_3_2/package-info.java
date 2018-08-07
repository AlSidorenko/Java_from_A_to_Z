/**
 * Created on 07.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.data_types_3.currency_converter_3_2;

/*

3.2. Конвертер валюты. [#41583]
  Петр Арсентьев,  02.06.18 11:39
В этом задании Вам необходимо разработать конвертер валюты.

Давайте сделаем базовый каркас приложения.

package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
//public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    //public int rubleToEuro(int value) {
        //return -1;
    //}

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    //public int rubleToDollar(int value) {
      //  return -1;
    //}
//}

/*
    Ваша задача.
        1. Реализовать метод конвертации рублей в евро и доллары. Добавить формулу вычисления.
        На текущий момент соотношение валют.

        То есть, Вам нужно вместo -1 подставить формулу для вычисления валюты.

        1 доллар = 60 рублей.
        1 евро = 70 рублей.

        2. Добавь еще два методы для обратно конвертации евро и долларов в рубли.

        3. Воспользуйтесь тестом.

        package ru.job4j.converter;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
}

Задание.

        1. Доработайте требуемый функционал.
        2. Залейте код в репозиторий.
        3. Создайте задачу в своей папке с имением. 3.2. Конвертер валюты.
        4. Выставите ответственного Петр Арсентьева.
*/