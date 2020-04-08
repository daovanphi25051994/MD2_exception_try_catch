
public class TestTriangle {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 2;
            int c = 0;
            Triangle triangle = new Triangle(a, b, c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
