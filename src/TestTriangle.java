import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a = ");
        double a = scanner.nextDouble();
        System.out.println("Enter b = ");
        double b = scanner.nextDouble();
        System.out.println("Enter c = ");
        double c = scanner.nextDouble();
        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
