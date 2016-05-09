package model;

/**
 * Created by Marvin on 09.05.2016.
 */
public class ClickCounter {
    private int count;

    public ClickCounter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}
