/**
 * Created on 14.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.cycle_5.refactoring_5_5;

/*
5.5. Рефакторинг кода. [#33459]
  Администратор,  02.06.18 4:34
Давайте теперь познакомимся с важной темой - это рефакторинг кода.

Рефакторинг - это изменения кода внутри класса, без изменения внешнего АПИ.

Целью рефакторинга является улучшения кода: убрать лишние или повторяющиеся куски кода.

Важно понять, что рефакторинг возможен только при наличии тестов.

Давайте займемся рефакторингом кода нашего класса Paint из задания  5.4. Построить пирамиду в псевдографике. [#4412]

Посмотрим на код класса.

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
}

    /*Как мы видим в коде у нас три метода, который имеют одинаковый код.

        У них есть одно отличие - это условие проверки, когда нужно проставить галку.

        Давайте сделаем универсальный метод, который будет принимать три параметра
        int height - высота пирамиды.
        int weight - ширина пирамиды.
        BiPredicate - условие проставление галки.
        BiPredicate - это функциональный интерфейс из пакета
        import java.util.function.BiPredicate;

        его нужно добавить в заголовок.

        Давайте теперь посмотрим, как это будет выглядеть в коде.

private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
        for (int column = 0; column != weight; column++) {
        if (predict.test(row, column)) {
        screen.append("^");
        } else {
        screen.append(" ");
        }
        }
        screen.append(System.lineSeparator());
        }
        return screen.toString();
        }

        В этом методе появляется новый элемент синтаксиса языка Java - Generics
        BiPredicate<Integer, Integer> - угловые скобки указывают на тип входящих данных.
        Дженерики будут подробно рассказано на втором уровне. Пока воспринимайте это как специальную конструкцию языка.

        Теперь давайте посмотрим, как можно использовать ваш метод.

public String rightTrl(int height) {
        return this.loopBy(
        height,
        height,
        (row, column) -> row >= column
        );
        }

        как мы видим код, уменьшился в разы.

        Конструкция
        (row, column) -> row >= column

        Это лямбды - Java 8 - так же этот элемент языка будет рассмотрен в третьем уровне курса.

        Давайте теперь посмотрим на как изменился весь класс.

        package ru.job4j.loop;

        import java.util.function.BiPredicate;

/**
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class Paint {
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}

    Как мы видим, код класса уменьшился в разы. Мы избавились от дублирования кода.

        Финальным элементом рефакторинга кода является запуск тестов.



        Как мы видим в коде теста мы никаких изменений не вносили. Поэтому никаких внешних воздействий наши изменения не повлекут.

        Задание

        1. Произведите рефакторинг кода класса Paint.
        2. Запустите тесты и проверьте, что ваши изменения не испортили работу программы.

        Важно.

        Целью данного задания является демонстрация применения рефакторинга кода.
        Помните. что если бы мы не писали тесты, а использовали только методы main, мы не смогли бы произвести рефакторинг без последствий.
        Так как нам нужно было повторно производить ручное тестирование.

        так же, не тратьте свое время на изучение темы джунериков и ламбд выражений. Они будут подробно рассмотрены дальше в курсе.
        Сейчас сосредоточьтесь на выполнении базовых элементов языка.

        Задание.

        1. В папке со своим именем создайте задачу c именем этой задачи.
        2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
        3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
        4. Переходите к следующей задаче.
 */