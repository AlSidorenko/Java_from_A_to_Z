/**
 * Created on 07.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.data_types_3.distance_between_points_3_4;

/*
3.4. Расстояние между точками в системе координат [#188]
 Администратор, 16.02.18 6:44
Прочитайте Хорстманн Java. Библиотека профессионала станицы 99 - 103.

В этом разделе мы познакомились с базовыми типами языка Java. Это примитивные и ссылочные типы.
На самом деле любой класс является типам данных.
Давайте с Вами создадим новым тип данных и научимся взаимодействовать с ним.

В это задаче мы создадим класс Point, который описывает точку в системе координат.
Так же мы научим наш новый тип данных взаимодействовать с самим собой.
Мы научим его считать расстояние до другой точки в системе координат.

1. Создайте файл chapter_001\src\main\java\ru\job4j\condition\Point.java

Создать класс Point c двумя полями x, y.
Этот класс будет описывать точку в системе координат.
x и y - это примитивные типы данных. То есть мы за счет простых типов описываем более сложные.

Ниже приведен полный код класса Point.

package ru.job4j.condition;

public class Point {
   private int x;
   private int y;

   public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
}

В этом классы мы создали поля.

   private int x;
   private int y;

и конструктор.

   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

Он нам нужен для инициализации нашей точки в системе координат. По сути мы загружаем данные в нашу новый тип.

Важный момент. Для записи значений в поля мы используем оператор this.x this.y. 

На данном этапе мы создали класс, который ничего не умеет делать.

Давайте его научим считать расстояние до другой точки.

Для этого мы создадим метод, который принимает другую точку (тип данных точка)  и возвращает вычисленное расстояние от текущей точки до входящей.


package ru.job4j.condition;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return -1;
    }
}

    Давайте найдем формулу по которой можно вычислить расстояние между двумя точками в системе координат.

        Как мы видим формула имеет 4 значения x2 x1 y2 y1. Давайте разберемся откуда в нашем коде появляются эти значения.

        Для эксперимента добавим в класс Point метод main.
        package ru.job4j.condition;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
/*public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return -1;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
    }
}

    В методе main мы создали два объекта типа Point и заполнили их значениями

        x1 = 0 y1 = 1
        x2 = 2 y2 = 5
        Давайте теперь разберемся, где они в методе distanceTo

public double distanceTo(Point that) {
        // Точка А - это текущая точка. К ней мы обращаемся через оператор this.
        Point a = this;
        // Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.
        // или для удоства мы создали новую переменню b и к ней присвоили переменную this.
        Point b = that;
        // сделаем вывод на консоль.
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        return -1;
        }

        Добавим вызов этого метода в main и запустим наш код.
public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        a.distanceTo(b);
        }


        Теперь перейдем к записи нашей формулы в коде.
        Здесь нам нужно вычислить корень и возвести в степень.
        Все эти операции уже реализованы в классе Math.

        Math.sqrt(a) - корень квадратный от a.

        Math.pow(a, b) - возведение числа а в степень b.
        Давайте теперь используя эти методы соберем нашу формулу.

public double distanceTo(Point that) {
        // Точка А - это текущая точка. К ней мы обращаемся через оператор this.
        Point a = this;
        // Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.
        // или для удоства мы создали новую переменню b и к ней присвоили переменную this.
        Point b = that;

        int x1 = a.x;
        int y1 = a.y;
        int x2 = b.x;
        int y2 = b.y;
        double result = Math.sqrt(
        Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        return result;
        }

        и добавьте в методе main выведем информацию на консоль.

public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // сделаем вызов метода
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
        }

        Теперь давайте избавимся от лишнего код. Упростим наше выражение.

public double distanceTo(Point that) {
        return Math.sqrt(
        Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
        }
        Вот так лаконично должен выглядеть конечный метод.

        Задание

        В этом задании ваша задача повторить действие описанные выше.

        1. Создать собственный тип Point (то есть просто создать class Point), описывающий точку в системе координат
        2. Научить этот тип рассчитывать расстоянием между собой и другой точкой.
        3. Залить этот класс на github.

 */