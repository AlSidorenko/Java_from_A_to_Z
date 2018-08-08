/**
 * Created on 08.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.conditional_statements_4.area_of_triangle_4_3;

/*
4.3. Вычисление площади треугольника [#9461]
  Петр Арсентьев,  22.06.18 6:24
1. Создайте файл chapter_001\src\main\java\ru\job4j\condition\Triangle.java

Создать класс Triangle c тремя полями Point.

Класс Point уже у нас создан. Мы будем его использовать в этом классе.

Так как мы находимся в одном пакете condition то мы можем использовать все классы, которые находятся в нем без добавления их в импорт.

Нужно составить программу которая будет вычислять площадь треугольника образованного этими точками. Программа должна учитывать условия невозможности построить треугольник через эти точки.
package ru.job4j.condition;

public class Triangle {
   private Point a;
   private Point b;
   private Point c;

   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

/**
* Метод вычисления полупериметра по длинам сторон.
*
* Формула.
*
* (ab + ac + bc) / 2
*
* @param ab расстояние между точками a b
* @param ac расстояние между точками a c
* @param bc расстояние между точками b c
* @return Перимент.
*/
/*public double period(double ab, double ac, double bc) {
        return -1; // вместо -1 нужно написать формулу вычисляющую полуперимент.
        }

        Используя формулу Герона.


/**
 * Метод должен вычислить площадь треугольника.
 *
 * @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
 */
/*public double area() {
        double rsl = -1; // мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том. что треугольника нет.
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
        // написать формулу для расчета площади треугольника.
        rsl = ... //вместо многоточия нужно написать формулу Герона с подставленными переменные ab, ac, dc, p.
        // Для извлечение квадратного корня надо использовать метод Math.sqrt()
        }
        return rsl;
        }

/**
 * Метод проверяет можно ли построить треугольник с такими длинами сторон.
 *
 * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
 *
 * @param ab Длина от точки a b.
 * @param ac Длина от точки a c.
 * @param bc Длина от точки b c.
 * @return
 */
/*private boolean exist(double ab, double ac, double bc) {
        return false;
        }
        }
        Заместо -1 - надо написать формулу вычисляющее значения методов.

        При тестировании метода area - у вас будут получается числа с плавающей точкой.

        Для тестирования таких чисел надо использовать класс http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/number/IsCloseTo.html

        добавьте статический импорт

        import static org.hamcrest.number.IsCloseTo.closeTo;

        Обязательно проверьте подключение библиотеки hamcrest-all.jar

<dependency>
<groupId>org.hamcrest</groupId>
<artifactId>hamcrest-all</artifactId>
<version>1.3</version>
<scope>test</scope>
</dependency>

        Пример использования

        import org.junit.Test;
        import static org.hamcrest.number.IsCloseTo.closeTo;
        import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // создаем три объекта класса Point.
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        // Создаем объект треугольник и передаем в него объекты точек.
        Triangle triangle = new Triangle(a, b, c);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}

    Что делать не надо.

        1. Здесь не надо использовать Scanner, System.in, System.out.println.

        2. В программе не должно быть ввода и вывода данных.

        3. Код всей программы проверяется через тесты.

        4. Не надо создавать метод public static void main(String[] args) - так вы занимаетесь ручным тестированием. В курсе используется только автоматическое тестирование за счет JUnit.
        5. В классах не надо добавлять методы get set. все что нужно. это наполнить методы указанные выше.


        Задание.

        1. В папке со своим именем создайте задачу c именем этой задачи.
        2. Заполните поле исходный код - укажите там ссылку на коммит к этой задаче.
        3. Выполните операцию начать и укажите отвественного Петра Арсентьева.
        4. Переходите к следующей задаче.

 */