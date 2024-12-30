class Shape {
    int length;
    int width;
    int radius;
}

class Rectangle extends Shape {
    double Area() {
        return length * width;
    }
    double Perimeter() {
        System.out.println("Perimeter of Rectangle n is " + 2 * (length + width));
        return 0;
    }
}
class Circle extends Shape {
    double Area() {
        System.out.println("The area of the circle is " + Math.PI * Math.pow(radius, 2));
        return 0;
    }
    double Circumference() {
        return 2 * Math.PI * radius;
    }
}



