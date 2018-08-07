/**
 * Created on 02.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 *
 *
 */
package ru.job4j.jvm_byte_code_1.junit_1_4;

/*
1.4. JUnit [#4122]
  Петр Арсентьев,  01.08.18 4:32
1. В задании нужно написать автоматический тест на класс Calculate.java.

Давайте добавим в класс Calculate метод echo.

/**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/
/*public String echo(String name) {
        return "Echo, echo, echo : " + name;
        }

        Помните, что код мы добавляем только в область класса.

public class Calculate {
    // здесь можно добавить метод.
}

    Целиком код будет выглядеть так.

        package ru.job4j.calculate;

/**
 * Calculate.
 *
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class Calculate {
    /**
     * Main.
     * @param args - args.
     */
    /*public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * Method echo.
     * @param name Your name.
     * @return Echo plus your name.
     */
    /*public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}

    Этот метод принимает параметр name и возвращает строчку "Echo, echo, echo : " + name;

        2. Прочтите инструкцию о том. что такое автоматические тесты. ссылка.

        3. Подключить библиотеки junit, hamcrest. Для этого в корневом pom.xml добавьте раздел.

        Он должен находиться между тегами <project> </project>.

<dependencies>
<dependency>
<groupId>org.hamcrest</groupId>
<artifactId>hamcrest-all</artifactId>
<version>1.3</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.12</version>
<scope>test</scope>
</dependency>
</dependencies>





        4. Создать файл chapter_001\src\test\java\ru\job4j\calculate\CalculateTest.java.

        Проверьте несколько раз. что Вы создали папку chapter_001\src\test

        test - это новая папка в который мы складываем все тесты.

        5. Теперь давайте реализуем наш тест.

        Для этого мы создаем обычный класс

public class CalculateTest {

}

Помним, что имя класса должно быть таким же как и название файла.

        Теперь давайте разберемся какие у нас входные значения, выходные значения и ожидаемые.

        Допустим. Я хочу задать параметр name равный "Petr Arsentev".

        String input = "Petr Arsentev";

        В этом случае ожидаемые значения будут. "Echo, echo, echo : Petr Arsentev"

        String expect = "Echo, echo, echo : Petr Arsentev";

        Далее нам нужно получить результат. Результат мы можем получить из выполнения действий.
        Для этого надо создать объект. Во всех тестах схема будет одна и та же. Пока на это внимание не обращайте.

//Создание нового объекта.
        Calculate calc = new Calculate();

//Выполнение метода echo с параметром input и запись ее в переменную result.
        String result = calc.echo(input);

        И на последнем этапе необходимо сравнить два значения result и expect.
        Это делается за счет команды

        assertThat(result, is(expect));

        Полный пример класса CalculateTest.

        package ru.job4j.calculate;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class CalculateTest {
    /**
     * Test echo.
     */
  /*  @Test
    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Petr Arsentev";
        String expect = "Echo, echo, echo : Petr Arsentev";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}


    Cоздать файл chapter_001\src\test\java\ru\job4j\calculate\package-info.java. По аналогии в задаче #4087

        Обратите внимание тут путь располагается в папке test
        chapter_001\src\test\java\ru\job4j\calculate\package-info.java.

        Давайте не много обсудим вот этот синтаксис @Test.

        Эти вещи называются аннотациями. Они добавляется над классами, методы и входящими параметрами.
        Используются они для создания дополнительного поведения.
        В данном примере @Test - указывает, что этот метод нужно запустить через метод main.
        Делается это не явно.

        Junit загружает весь класс тест - CalculateTest. Через механизмы рефлексии он может проанализировать структуру класса.
        Junit ищет методы отмеченные аннотацией @Test. Для каждого метода он создает экземпляр класса и вызывает метод отмеченный @Test

6. запустить тесты через mvn clean test





        Давайте изменим код в методе echo. Сделаем там ошибку.

public String echo(String name) {
        return "Eho, echo, echo : " + name;
        }

        Я убрал букву C из первого слова и снова запустим тест.



        Проект не собрался.

        Как понять в чем причина?

        Выше в логе есть блок Tests.



        Здесь видно. Что тест сравнил два значения и понял. что они не равны.



        Давайте поправим код методы echo И запустим тест заново.

        7. Убедится, что тесты выполнились успешно. В консоли будет написано BUILD SUCCESSFUL.


        8. Добавить все измененные и новые файлы в репозиторий.
        9. Пример проекта можно найти ниже.
        10. Цель данного задания. Создания теста. Если Вам непонятен код данного теста, не волнуйтесь, дальше про это будет рассказано.

        Задание.

        1. В папке со своим именем создайте задачу c именем этой задачи.
        2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
        3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
        4. Переходите к следующей задаче.

 */