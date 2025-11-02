public class PatternMatchingInstanceOfExample {

    // Before Java 17
    public static void beforeJava17(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj; // manual cast
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a string");
        }
    }

    // Java 17 pattern matching for instanceof
    public static void java17PatternMatching(Object obj) {
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a string");
        }
    }

    public static void main(String[] args) {
        beforeJava17("Hello");
        beforeJava17(123);

        System.out.println("-----");

        java17PatternMatching("Welcome");
        java17PatternMatching(456);
    }
}
