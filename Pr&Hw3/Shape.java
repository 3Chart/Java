import static java.lang.Math.pow;

public abstract class Shape {
    String color = "";
    boolean filled;

    Shape(){}
    Shape(String Scolor, boolean Sfilled) {color = Scolor; filled = Sfilled;}

    String getColor() {return color;}
    boolean isFilled() {return filled;}

    void setColor(String Scolor) {color = Scolor;}
    void setFilled(boolean Sfilled) {filled = Sfilled;}

    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
class Circle extends Shape{
    double radius = 0;

    Circle() {};
    Circle(double Cradius) {radius = Cradius;};
    Circle(double Cradius, String Ccolor, boolean Cfilled) {radius = Cradius; color = Ccolor; filled = Cfilled;};
    void setRasius(double Cradius) {radius = Cradius;}
    double getRadius() {return radius;}
    @Override
    double getArea() {
        return pow(Math.PI * radius, 2);
    }
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "radius: " + radius + "; color: " + color + "; filled: " + filled;
    }
}

class Rectangle extends Shape {
    double width = 0;
    double length = 0;

    Rectangle() {}
    Rectangle(double Rwidth, double Rlength) {width = Rwidth; length = Rlength;}
    Rectangle(double Rwidth, double Rlength, String Rcolor, boolean Rfilled) {width = Rwidth; length = Rlength; color = Rcolor; filled = Rfilled;}

    void setWidth(double Rwidth) {width = Rwidth;}
    void setLength(double Rlength) {length = Rlength;}

    double getWidth() {return width;}
    double getLength() {return length;}
    @Override
    double getArea() {
        return width * length;
    }
    @Override
    double getPerimeter() {
        return width + length;
    }
    @Override
    public String toString() {
        return "width: " + width + "; length: " + length + "; color: " + color + "; filled: " + filled;
    }
}

class Square extends Rectangle {
    Square() {}
    Square(double Sqside) {width = Sqside; length = Sqside;}
    Square(double Sqside,String Sqcolor, boolean Sqfilled) {width = Sqside; length = Sqside; color = Sqcolor; filled = Sqfilled;}
    double getSide() {return length;}
    void setSide(double Sqside) {length = Sqside; width = Sqside;}
}

class Main
{
    public static void main(String[] args) {
        Circle C1 = new Circle(5,"red",true);
        double p1 = C1.getPerimeter();
        System.out.println(p1);
        Rectangle R1 = new Rectangle(2, 3, "white",true);
        double p2 = R1.getPerimeter();
        System.out.println(p2);
    }
}
