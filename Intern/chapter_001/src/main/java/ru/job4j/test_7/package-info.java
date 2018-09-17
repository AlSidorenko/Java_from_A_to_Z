/**
 * Created on 21.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.test_7;

/*
Крестики-нолики на JavaFX [#49777]
 Петр Арсентьев, 09.07.18 5:53
В этом задании нужно реализовать игру крестики-нолики.
В этом задании задан каркас приложения. Вам нужно реализовать только один класс Logic3T.
Игра имеет визуальный интерфейс сделанных через JavaFX.

Важно Вам нужно создать три класса в папке ru.job4j.tictactoe
Каркас.

Класс Figure3T - отвечает за клетку на поле.
Он содержит методы - имеет ли клетка крестик или нолик. или пустая.
package ru.job4j.tictactoe;
import javafx.scene.shape.Rectangle;
public class Figure3T extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    public Figure3T() {
    }

    public Figure3T(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }
    public void take(boolean markX) {
            this.markX = markX;
            this.markO = !markX;
    }
    public boolean hasMarkX() {
        return this.markX;
    }
    public boolean hasMarkO() {
        return this.markO;
    }
}
Класс TicTacToe - реализует визуальный компонент. Не волнуйтесь, если вы не понимаете большинство кода в этом классе.
Дальше в курсе будет разобраны все эти элементы. Здесь просто скопируйте этот код.
package job4j.tictactoe;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class TicTacToe extends Application {
    private static final String JOB4J = "Крестики-нолики www.job4j.ru";
    private final int size = 3;
    private final Figure3T[][] cells = new Figure3T[size][size];
    private final Logic3T logic = new Logic3T(cells);
    private Figure3T buildRectangle(int x, int y, int size) {
        Figure3T rect = new Figure3T();
        rect.setX(x * size);
        rect.setY(y * size);
        rect.setHeight(size);
        rect.setWidth(size);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);
        return rect;
    }
    private Group buildMarkO(double x, double y, int size) {
        Group group = new Group();
        int radius = size / 2;
        Circle circle = new Circle(x + radius, y + radius, radius - 10);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        group.getChildren().add(circle);
        return group;
    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(JOB4J);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private boolean checkState() {
        boolean gap = this.logic.hasGap();
        if (!gap) {
            this.showAlert("Все поля запонены! Начните новую Игру!");
        }
        return gap;
    }
    private void checkWinner() {
        if (this.logic.isWinnerX()) {
            this.showAlert("Победили Крестики! Начните новую Игру!");
        } else if (this.logic.isWinnerO()) {
            this.showAlert("Победили Нолики! Начните новую Игру!");
        }
    }
    private Group buildMarkX(double x, double y, int size) {
        Group group = new Group();
        group.getChildren().addAll(
                new Line(
                        x + 10, y  + 10,
                        x + size - 10, y + size - 10
                ),
                new Line(
                        x + size - 10, y + 10,
                        x + 10, y + size - 10
                )
        );
        return group;
    }
    private EventHandler<MouseEvent> buildMouseEvent(Group panel) {
        return event -> {
            Figure3T rect = (Figure3T) event.getTarget();
            if (this.checkState()) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    rect.take(true);
                    panel.getChildren().add(
                            this.buildMarkX(rect.getX(), rect.getY(), 50)
                    );
                } else {
                    rect.take(false);
                    panel.getChildren().add(
                            this.buildMarkO(rect.getX(), rect.getY(), 50)
                    );
                }
                this.checkWinner();
                this.checkState();
            }
        };
    }
    private Group buildGrid() {
        Group panel = new Group();
        for (int y = 0; y != this.size; y++) {
            for (int x = 0; x != this.size; x++) {
                Figure3T rect = this.buildRectangle(x, y, 50);
                this.cells[y][x] = rect;
                panel.getChildren().add(rect);
                rect.setOnMouseClicked(this.buildMouseEvent(panel));
            }
        }
        return panel;
    }
    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        HBox control = new HBox();
        control.setPrefHeight(40);
        control.setSpacing(10.0);
        control.setAlignment(Pos.BASELINE_CENTER);
        Button start = new Button("Начать");
        start.setOnMouseClicked(
                event -> border.setCenter(this.buildGrid())
        );
        control.getChildren().addAll(start);
        border.setBottom(control);
        border.setCenter(this.buildGrid());
        stage.setScene(new Scene(border, 300, 300));
        stage.setTitle(JOB4J);
        stage.setResizable(false);
        stage.show();
    }
}
Класс Logic3T отвечает за проверку логики. В этом задании тебе нужно до реализовать эти методы.
package ru.job4j.tictactoe;
public class Logic3T {
    private final Figure3T[][] table;
    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }
    public boolean isWinnerX() {
        return false;
    }
    public boolean isWinnerO() {
        return false;
    }
    public boolean hasGap() {
        return true;
    }
}
По нажатию на левую кнопку мыши выставляется крестик, на правую нолик.
Чтобы запустить игру нужно в IDEA запустить класс TicTacToe.

Сейчас игра не содержит логики. За логику отвечает класс Logic3T.
Вам нужно реализовать три метода.
public boolean isWinnerX() - проверяет есть ли в поле выигрышные комбинации для Крестика.
public boolean isWinnerO() - проверяет есть ли в поле выигрышные комбинации для Нолика.
public boolean hasGap() - проверяет, если ли пустые клетки для новых ходов.
Давайте сразу напишем тесты для проверки этой логики.
package ru.job4j.tictactoe;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class Logic3TTest {
    @Test
    public void whenHasXWinner() {
        Figure3T[][] table = {
                {new Figure3T(true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerX(), is(true));
    }
    @Test
    public void whenHasOWinner() {
        Figure3T[][] table = {
                {new Figure3T(false), new Figure3T(), new Figure3T()},
                {new Figure3T(false), new Figure3T(true), new Figure3T()},
                {new Figure3T(false), new Figure3T(), new Figure3T(true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.isWinnerO(), is(true));
    }
    @Test
    public void whenHasGas() {
        Figure3T[][] table = {
                {new Figure3T(true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true)},
        };
        Logic3T login = new Logic3T(table);
        assertThat(login.hasGap(), is(true));
    }
}
Задание.
1. Реализуйте методы в классе Logic3T.
   Решение этой задачи сводиться к решению предыдущих задач :
    6.3. Массив заполнен true или false [#53857] и  6.7. Квадратный массив заполнен true или false по диагоналям. [#53859]
2. Добавить еще тестов в класс Logic3TTest.
3. Создать задачу в своей папке и выставить ответственного Петр Арсентьева.
Объяснение решения.
1. Если ты уже написал код, то можешь начать читать эту секцию. Здесь будет объяснено. как нужно было решить это задание.
2. Давайте посмотрим на все возможные варианты решения игры крестики нолики.




Как мы видим, то везде необходимо проверять последовательность. Единственное отличие это в направлении движения следующего элемента.
Можно этот алгоритм выразить формулой - cell[x + deltaX][y + deltaY] == true.
Так же во всех 4 случаях у нас разная начальная точка.
Теперь давайте определить универсальный метод, который может вычислить эти последовательности.
public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY);
Predicate<Figure3T> predicate - это параметризованное поведение. Мы его вводим, так как у нас два события: проверка на X и О.
int startX, startY - начальная точка
int deltaX, int deltaY - движения.
Для горизонтали движение будет по x, для вертикале по y, по диагонали движение должно быть и по x и по y.
Давайте теперь реализуем этот метод.
public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
    boolean result = true;
    for (int index = 0; index != this.table.length; index++) {
        Figure3T cell = this.table[startX][startY];
        startX += deltaX;
        startY += deltaY;
        if (!predicate.test(cell)) {
            result = false;
            break;
        }
    }
    return result;
}
И давайте проверим 3 пример из рисунка.
this.fillBy(Figure3T::hasMarkX, 0, 2, 1, 0)
Figure3T::hasMarkX - это лябмда выражение означающее для каждого объекта Figure3T вызвать метод hasMarkX
Аналогично можно заменить для hasMarkY
Как его можно использовать.
public boolean isWinnerX() {
    return this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 0) ||
            this.fillBy(Figure3T::hasMarkX, 0, 0, 0, 1) ||
            this.fillBy(Figure3T::hasMarkX, 0,0, 1, 1) ||
            this.fillBy(Figure3T::hasMarkX, this.table.length - 1 , 0, -1, 1);
}
Метод выше проверяет не все случаи. Вам нужно доработать его.
Возьмите пример тестов ниже.
@Test
public void whenHasXWinner() {
    Figure3T[][] table = {
            {new Figure3T(true), new Figure3T(), new Figure3T()},
            {new Figure3T(), new Figure3T(true), new Figure3T()},
            {new Figure3T(), new Figure3T(), new Figure3T(true)},
    };
    Logic3T login = new Logic3T(table);
    assertThat(login.isWinnerX(), is(true));
}
@Test
public void whenHasXHorizontalWinner() {
    Figure3T[][] table = {
            {new Figure3T(), new Figure3T(), new Figure3T()},
            {new Figure3T(true), new Figure3T(true), new Figure3T(true)},
            {new Figure3T(), new Figure3T(), new Figure3T()},
    };
    Logic3T login = new Logic3T(table);
    assertThat(login.isWinnerX(), is(true));
}
@Test
public void whenHasXVerticalWinner() {
    Figure3T[][] table = {
            {new Figure3T(), new Figure3T(true), new Figure3T()},
            {new Figure3T(), new Figure3T(true), new Figure3T()},
            {new Figure3T(), new Figure3T(true), new Figure3T()},
    };
    Logic3T login = new Logic3T(table);
    assertThat(login.isWinnerX(), is(true));
}
@Test
public void whenHasXBackDiagonalWinner() {
    Figure3T[][] table = {
            {new Figure3T(), new Figure3T(), new Figure3T(true)},
            {new Figure3T(), new Figure3T(true), new Figure3T()},
            {new Figure3T(true), new Figure3T(), new Figure3T()},
    };
    Logic3T login = new Logic3T(table);
    assertThat(login.isWinnerX(), is(true));
}
 */