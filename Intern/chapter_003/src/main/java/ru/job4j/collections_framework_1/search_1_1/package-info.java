/**
 * Created on 16.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.collections_framework_1.search_1_1;

/*
1. Телефонный справочник на базе ArrayList [#41598]
  Петр Арсентьев,  17.02.18 6:42
Частой задачей программиста является поиск данных в списках.

Давайте с Вами напишем программу поиска в списке.

У нас есть пользователь с полями: name, surname, phone, address.

package ru.job4j.search;

public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}

Давайте составим модель справочника.

package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
/*public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        return result;
        }
        }

        Поиск мы должны осуществлять по всем полям через метод String.contains.
        Например. Арсентьев, Петр, Брянск, 53742. Если мы ищем по слово "нкс" или 537 или Арс. Мы всегда должны вернуть этого пользователя.

        Давайте так же напишем тест на этот пример.

        package ru.job4j.search;

        import org.junit.Test;
        import java.util.List;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }
}

Задание.

        1. Доработайте требуемый функционал.
        2. Залейте код в репозиторий.
        3. Создайте задачу в своей папке с имением. 1. Телефонный справочник на базе ArrayList.
        4. Выставите ответственного Петр Арсентьева.

 */