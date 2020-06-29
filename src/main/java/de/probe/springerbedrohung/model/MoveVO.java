package de.probe.springerbedrohung.model;

/**
 * VO that defines a chess move. x and y are the directions of the move and
 */
public class MoveVO {
    private int x;
    private int y;

    public MoveVO() {
    }

    public MoveVO(int x, int y) {
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
