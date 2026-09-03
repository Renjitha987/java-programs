// Parent Class
class Shape {
    String color = "Red";

    void displayColor() {
        System.out.println("The color of this shape is: " + color);
    }
}

// Child Class 1
class Circle extends Shape {
    double radius = 5.0;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

// Child Class 2
class Square extends Shape {
    double side = 4.0;

    void calculateArea() {
        double area = side * side;
        System.out.println("Area of the Square: " + area);
    }
}

// Main Class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        System.out.println("--- Testing Circle ---");

        Circle myCircle = new Circle();

        // Accessing Parent method
        myCircle.displayColor();

        // Accessing Circle method
        myCircle.calculateArea();

        System.out.println();

        System.out.println("--- Testing Square ---");

        Square mySquare = new Square();

        // Accessing Parent method
        mySquare.displayColor();

        // Accessing Square method
        mySquare.calculateArea();
    }
}