package ru.job4j.conditional_statements_4.stupid_bot_4_1;

/**
 * Created on 08.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class DummyBot {

/**
 * Отвечает на вопросы.
 * @param question Вопрос от клиента.
 * @return Ответ.
 */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
