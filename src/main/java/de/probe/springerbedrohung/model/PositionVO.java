package de.probe.springerbedrohung.model;

/**
 * VO that holds positional information.
 */
public class PositionVO {
    private int x;
    private int y;

    public PositionVO() {
    }

    public PositionVO(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
