/**
 * Created on 20.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.transfers_5;

/*
Банковские переводы. [#10038]
  Каретко Виктор,  19.02.18 6:26
Реализовать коллекцию Map для банка

Необходимо создать класс User с полями name, passport.

Добавить методы eqauls() hashCode()

Необходимо создать класс Account с полями value (кол-во денег), requisites (реквизиты счёта) - это банковский счёт.

Реализовать коллекцию Map <User, List<Account>>, обозначающую что у каждого пользователя может быть список банковских счетов.

Необходимо реализовать возможность перечислять деньги, как с одного счёта User на другой счёт того же User, так и на счёт другого User.

В программе должны быть методы:

public void addUser(User user) {} - добавление пользователя.

public void deleteUser(User user) {} - удаление пользователя.

public void addAccountToUser(String passport, Account account) {} - добавить счёт пользователю.

public void deleteAccountFromUser(String passport, Account account) {} - удалить один счёт пользователя.

public List<Accounts> getUserAccounts (String passport) {} - получить список счетов для пользователя.

public boolean transferMoney (String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) - метод для перечисления денег с одного счёта на другой счёт:
если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.

Посмотрите на методы Map.putIfAbsent и List.indexOf, как их можно применить в этом задании.
 */