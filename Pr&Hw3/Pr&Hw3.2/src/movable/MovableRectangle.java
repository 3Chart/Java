package movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xs, int ys) {
        topLeft = new MovablePoint(x1, y1, xs, ys);
        bottomRight = new MovablePoint(x2, y2, xs, ys);
    }

    public String toString() {
        return "x1 = " + topLeft.x + " y1 = " + topLeft.y + ", speed of point x1 = " + topLeft.xs + ", speed of point y1 = " + topLeft.ys +
                "\n" + "x2 = " + bottomRight.x + " y2 = " + bottomRight.y + ", speed of point x2 = " + bottomRight.xs + ", speed of point x2 = "
                + bottomRight.ys;
    }

    private boolean isSpeedEqual() {
        if (topLeft.xs == bottomRight.xs && topLeft.ys == bottomRight.ys) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void moveUp() {
        if (isSpeedEqual()) {
            topLeft.y += topLeft.ys;
            bottomRight.y += bottomRight.ys;
        } else {
            System.out.println("ERROR! Speed is not equal");
        }

    }

    @Override
    public void moveDown() {
        if (isSpeedEqual()) {
            topLeft.y -= topLeft.ys;
            bottomRight.y -= bottomRight.ys;
        } else {
            System.out.println("ERROR! Speed is not equal");
        }

    }

    @Override
    public void moveLeft() {
        if (isSpeedEqual()) {
            topLeft.x -= topLeft.xs;
            bottomRight.x -= bottomRight.xs;
        } else {
            System.out.println("ERROR! Speed is not equal");
        }

    }

    @Override
    public void moveRight() {
        if (isSpeedEqual()) {
            topLeft.x += topLeft.xs;
            bottomRight.x += bottomRight.xs;
        } else {
            System.out.println("ERROR! Speed is not equal");
        }

    }
}
