package oop.this_test;

public class PolyMorphism_test {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        printResult(t);
        printResult(r);
    }

    public static void printResult(Shape shape){
        System.out.printf("넓이는 %.1f입니다.\n", shape.calculateArea());
    }
}

interface Shape {
    double calculateArea();
}

class Triangle implements Shape {

    @Override
    public double calculateArea() {
        return 3;
    }
}

class Rectangle implements Shape {

    @Override
    public double calculateArea() {
        return 4;
    }
}
