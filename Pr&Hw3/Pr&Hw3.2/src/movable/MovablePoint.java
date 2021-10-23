package movable;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xs;
    int ys;

    public MovablePoint(int x, int y, int xs, int ys) {
        this.x = x;
        this.y = y;
        this.xs = xs;
        this.ys = ys;
    }

    public String toString() {
        return "x = " + x + " y = " + y + ", speed of point x = " + xs + ", speed of point y = " + ys;
    }

    @Override
    public void moveUp() {
        y += ys;
    }

    @Override
    public void moveDown() {
        y -= ys;
    }

    @Override
    public void moveLeft() {
        x -= xs;
    }

    @Override
    public void moveRight() {
        x += xs;
    }
}
