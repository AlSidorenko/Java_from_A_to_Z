package ru.job4j.generalizations_2.changetracker_2_3.abstractclasses.input;

import java.util.List;

/**
 * Created on 01.09.2017.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StubInput implements Input {

    /**
     * @param answers - List's param.
     */
    private List<String> answers;

    /**
     * @param position - param count position.
     */
    private int position = 0;

    /**
     * Constructor.
     * @param answers - List's param.
     */
    public StubInput(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return answers.get(position++);
    }

    @Override
    public int ask(String question, List<Integer> range) {
        return -1;
    }
}
