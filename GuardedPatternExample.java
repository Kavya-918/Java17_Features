
public class GuardedPatternExample {

    // Before Java 17: Using traditional if-else
    public static void beforeJava17(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj; // manual cast
            if (s.length() > 5)
                System.out.println("Long string: " + s);
            else
                System.out.println("Short string: " + s);
        } else {
            System.out.println("Not a string");
        }
    }

    //  Java 17: Using switch expression + guarded pattern (when)
    public static void java17GuardedPattern(Object obj) {
        switch (obj) {
            case String s when s.length() > 5 -> System.out.println("Long string: " + s);
            case String s -> System.out.println("Short string: " + s);
            default -> System.out.println("Not a string");
        }
    }

    // 🧠 Main method
    public static void main(String[] args) {
        System.out.println("Before Java 17 Version:");
        beforeJava17("Hello");
        beforeJava17("Welcome");
        beforeJava17(123);

        System.out.println("\nJava 17 Version (Guarded Pattern):");
        java17GuardedPattern("Hello");
        java17GuardedPattern("Welcome");
        java17GuardedPattern(123);
    }
}
