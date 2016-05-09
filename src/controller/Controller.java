package controller;

import model.ClickCounter;

import java.awt.event.ActionEvent;
import java.util.Observable;

/**
 * Created by Marvin on 09.05.2016.
 */
public class Controller extends Observable {
    private final ClickCounter counter;

    public Controller() {
        counter = new ClickCounter();
    }

    public int getCount() {
        return counter.getCount();
    }

    public void increment(ActionEvent actionEvent) {
        counter.increment();
        setChanged();
        notifyObservers();
    }
}