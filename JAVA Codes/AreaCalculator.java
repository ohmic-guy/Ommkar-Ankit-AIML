public class AreaCalculator {

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double length, double breadth) {
        return length * breadth;
    }

    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return area(base, height);
        }
    }

    public int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Areas are as follows");
        System.out.println("1. Area of Circle (r = 5): " + calc.area(5.0));
        System.out.println("2. Area of Rectangle (l = 4, b = 6): " + calc.area(4.0, 6.0));
        System.out.println("3. Area of Triangle (base = 4, height = 5): " + calc.area(4.0, 5.0, true));
        System.out.println("4. Area of Square (side = 4): " + calc.area(4));
    }
}
