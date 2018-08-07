/**
 * Created on 08.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.conditional_statements_4.stupid_bot_4_1;

/*
4.1. Глупый бот. [#31323]
  Петр Арсентьев,  06.07.18 15:05
Вам необходимо разработать программу - глупый бот.

Бот должен принимать слово и возвращать ответ.

Бот наш глупый. Он умеет отвечать только на три Фразы.

Если пришла фаза "Привет, Бот." бот отвечает "Привет, умник."

Если пришла фаза "Пока." бот отвечает "До скорой встречи."

Если пришла любая другая фраза  бот отвечает "Это ставит меня в тупик. Спросите другой вопрос."

Помните, что строки можно сравнивать только через методы equals. Нельзя использовать ==.

Давайте составим каркас класса.

package ru.job4j.condition;

/**
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
  /*  public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = ...;
        } else if (....) { // заменить ... на проверку, что этот вопрос известен боту и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = ..;
        }
        return rsl;
    }
}


    И давайте добавим тесты.

        package ru.job4j.condition;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * @author Petr Arsentev (mailto:parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Спросите другой вопрос.")
        );
    }
}

Задание.

        1. В папке со своим именем создайте задачу c именем этой задачи.
        2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
        3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
        4. Переходите к следующей задаче.
 */