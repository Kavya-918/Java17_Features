public class SwitchHandleNullExample {

    //  Before Java 17
    public static void beforeJava17(String s) {
        if (s == null) {
            System.out.println("oops! null value ");
            return;
        }

        switch (s) {
            case "Foo":
            case "Bar":
                System.out.println("Great!");
                break;
            default:
                System.out.println("Ok!");
        }
    }

    // Java 17 version
    public static String describe(Object obj) {
        return switch (obj) {
            case null -> "It's null";
            case Integer i -> "An Integer";
            case String s -> "A String";
            default -> "Something else";
        };
    }

    public static void main(String[] args) {
        System.out.println("---- Before Java 17 ----");
        beforeJava17(null);
        beforeJava17("Foo");

        System.out.println("\n---- Java 17 ----");
        System.out.println(describe(null));
        System.out.println(describe(25));
        System.out.println(describe("Hello"));
        System.out.println(describe(12.5));
    }
}
