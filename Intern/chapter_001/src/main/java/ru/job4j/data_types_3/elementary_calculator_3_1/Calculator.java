package ru.job4j.data_types_3.elementary_calculator_3_1;

/**
 * Created on 07.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Calculator {

    /**
     * Result of the action being performed.
     */
    private double result;

    /**
     * Addition.
     * @param first - Numeric value.
     * @param second - Numeric value.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Subtraction.
     * @param first - numeric value.
     * @param second - numeric value.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Division.
     * @param first - numeric value.
     * @param second - numeric value.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Multiple.
     * @param first - numeric value.
     * @param second - numeric value.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Get's method.
     * @return - result.
     */
    public double getResult() {
        return this.result;
    }
}
