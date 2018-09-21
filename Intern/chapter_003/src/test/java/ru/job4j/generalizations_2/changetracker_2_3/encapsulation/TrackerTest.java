package ru.job4j.generalizations_2.changetracker_2_3.encapsulation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Created on 09.08.2017.
 * Tests for Class Tracker methods.
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class TrackerTest {
    /**
     * Test for Method addItem().
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"});
        tracker.addItem(item);
        assertThat(tracker.findAll().get(0), is(item));
    }
    /**
     * Test for Method update().
     */
    @Test
    public void whenUpdateItem() {
        Tracker tracker = new Tracker();
        Item previous = tracker.addItem(
                new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"}));
        tracker.update(
                new Item(previous.getId(), "Anna", "desc", 21L, new String[]{"ccccc", "dddddd"}));
        assertThat(tracker.findById(previous.getId()).getName(), is("Anna"));
    }
    /**
     * Test for Method delete().
     */
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item previous = tracker.addItem(
                new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"}));
        tracker.delete(previous);
        assertThat(tracker.findById(previous.getId()), is(nullValue()));
    }
    /**
     * Test for Method findAll().
     */
    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        tracker.addItem(new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"}));
        tracker.addItem(new Item("2", "Anna", "desc", 18L, new String[]{"ccccc", "eeeee"}));
        assertThat(tracker.findAll().size(), is(2));
    }
    /**
     * Test for Method findByName().
     */
    @Test
    public void whenFindByNameItem() {
        Tracker tracker = new Tracker();
        Item previous = tracker.addItem(
                new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"}));
        assertThat(tracker.findByName("Alec").get(0), is(previous));
    }
    /**
     * Test for Method findById().
     */
    @Test
    public void whenFindByIdItem() {
        Tracker tracker = new Tracker();
        tracker.addItem(new Item("1", "Alec", "desc", 25L, new String[]{"aaaaa", "bbbbb"}));
        tracker.addItem(new Item("2", "Anna", "desc", 18L, new String[]{"ccccc", "eeeee"}));
        assertThat(tracker.findById("1"), is(tracker.findAll().get(0)));
    }
}