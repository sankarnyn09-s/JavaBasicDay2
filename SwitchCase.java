public class SwitchCase {
    public static void main(String[] args) {
        int day = 2;

        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Other day");
        }
    }
}