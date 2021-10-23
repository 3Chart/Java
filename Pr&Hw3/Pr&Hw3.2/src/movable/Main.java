package movable;

public class Main {
    public static void main(String[] args) {
     System.out.println();
        System.out.println();
    MovableRectangle mr = new MovableRectangle(-1,1,1,-1, 10, 10);
        System.out.println(mr.toString());
        mr.moveDown();
        mr.moveLeft();
        System.out.println(mr.toString());
    }
}
