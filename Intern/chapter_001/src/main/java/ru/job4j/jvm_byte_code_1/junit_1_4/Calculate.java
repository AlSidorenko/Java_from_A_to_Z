package ru.job4j.jvm_byte_code_1.junit_1_4;

/**
 * Created on 02.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Calculate {

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Hello World.");
    }

    /**
     * Method echo.
     * @param name - user's name.
     * @return - Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}
