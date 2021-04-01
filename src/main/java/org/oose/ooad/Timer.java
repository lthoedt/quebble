package org.oose.ooad;

public class Timer {
    private long start;

    public void start() {
        this.start = System.currentTimeMillis();
    }

    public int stop() {
        return (int) (System.currentTimeMillis() - start);
    }
}
