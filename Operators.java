public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println(a + b);
        System.out.println(a - b);

        a += 5;
        a++;

        System.out.println(a > b && b < 10);
        System.out.println(a == b);
        System.out.println(a & b);

        int max = (a > b) ? a : b;
        System.out.println(max);
    }
}