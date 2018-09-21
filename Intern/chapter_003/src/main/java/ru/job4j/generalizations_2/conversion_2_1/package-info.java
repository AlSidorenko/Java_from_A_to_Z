/**
 * Created on 24.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.generalizations_2.conversion_2_1;

/*
1. Конвертация листа массивов в один лист Integer [#10037]
  Каретко Виктор,  11.03.17 8:32
В классе ConvertList из 3-го задания 1-го урока написать метод:

public List<Integer> convert (List<int[]> list)

В этом методе вы должны пройтись по всем элементам всех массивов в списке list и добавить их в один общий лист Integer.

Массивы в списке list могут быть разного размера.

Например:
list.add(new int[]{1, 2})
list.add(new int[]{3, 4, 5, 6})
List<Integer> result = convertList.convert(list)

List<Integer> result будет содержать элементы: (1, 2, 3, 4, 5, 6)
 */