package ru.job4j.generalizations_2.changetracker_2_3.internalclasses;

/**
 * Created on 14.11.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StartUI {

    /**
     * @param input - param of interface.
     */
    private Input input;

    /**
     * Constructor StartUI.
     * @param input - param of interface.
     */
    public StartUI(Input input) {
        this.input = input;
    }

    /**
     * Method showed menu.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();

        do {
            menu.show();
            int key = Integer.valueOf(input.ask("Select: "));
            menu.select(key);
        } while (!"y".equals(this.input.ask("Exit? (y/n): ")));
    }

    /**
     * Start program.
     * @param args - array.
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }
}
