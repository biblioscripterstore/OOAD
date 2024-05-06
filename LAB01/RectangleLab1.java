import java.util.Scanner;

public class RectangleLab1 {
    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(width, length);
        display(width, length, area);
    }
    public static double getLength() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of Rectangle: ");
        double length = input.nextDouble();
        while (length <= 0) {
            System.out.print("Length of Rectangle must be greater than 0\nPlease enter the length of Rectangle again: ");
            length = input.nextDouble();
        }
        return length;
    }
    public static double getWidth() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the width of Rectangle: ");
        double width = input.nextDouble();
        while (width <= 0) {
            System.out.print("Width of Rectangle must be greater than 0\nPlease enter the width of Rectangle again: ");
            width = input.nextDouble();
        }
        return width;
    }
    public static double getArea(double width, double length) {
        return width * length;
    }
    public static void display(double width, double length, double area) {
        System.out.println("Width of Rectangle: " + width);
        System.out.println("Length of Rectangle: " + length);
        System.out.println("Area of Rectangle: " + area);
    }
}
