/**
 * @author devonline
 * @link http:/devonline.academy/java
 */
public class HelloWorld {
    int c = 3;
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println(add(a, b));
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
