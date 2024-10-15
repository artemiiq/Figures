public class Main {
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShape(Shape.circle);
        shapePrinter.printShape(Shape.quad);
        shapePrinter.printShape(Shape.rectangle);
        shapePrinter.printShape(Shape.triangle);
        shapePrinter.printShape(Shape.rhombus);
    }
}

abstract class Shape {
    public static final Circle circle = new Circle();
    public static final Quad quad = new Quad();
    public static final Rectangle rectangle = new Rectangle();
    public static final Triangle triangle = new Triangle();
    public static final Rhombus rhombus = new Rhombus();
}
class ShapePrinter {
    public void printShape(Shape shape) {
        System.out.println("Shape: " + shape.toString());
    }
}
class Circle extends Shape {
    @Override
    public String toString() {
        return "It's a Circle!";
    }
}
class Quad extends Shape {
    @Override
    public String toString() {
        return "It's a Quad!";
    }
}
class Rectangle extends Shape {
    @Override
    public String toString() {
        return "It's a Rectangle!";
    }
}
class Triangle extends Shape {
    @Override
    public String toString() {
        return "It's a Triangle!";
    }
}
class Rhombus extends Shape {
    @Override
    public String toString() {
        return "It's a Rhombus!";
    }
}