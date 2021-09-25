package Lab1;

public class Ball {
    private String colour;
    private int size;
    public Ball(String ballcolour, int ballsize) {
        colour = ballcolour;
        size = ballsize;
    }

    public Ball(String ballcolour) {
        colour = ballcolour;
        size = 0;
    }

    public Ball(int ballsize) {
        size = ballsize;
        colour = "С рисунком или прозрачный";
    }

    public String GС()
    {
        return colour;
    }
    public int GS()
    {
        return size;
    }

    public void SC(String ballcolour) {
        this.colour = ballcolour;
    }
    public void SS(int ballsize) {
        this.size = ballsize;
    }

    public String toString(){return "Colour of ball: " + this.colour + ", size of ball:" + this.size + "см";}
    public static void main(String[] args) {
        Ball ball1 = new Ball("Красный", 2);
        Ball ball2 = new Ball("Синий");
        Ball ball3 = new Ball(5);
        ball3.SC("Желтый");
        System.out.println(ball3);
    }
}
