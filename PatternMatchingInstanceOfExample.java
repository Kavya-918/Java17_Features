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
        if (obj instanceof String s) { //pattern variable s
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



/** output


"C:\Program Files\Java\jdk-17.0.4\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.5\lib\idea_rt.jar=61740" -Dfile.encoding=UTF-8 -classpath D:\Java17\out\production\Java17 PatternMatchingInstanceOfExample
String length: 5
Not a string
-----
String length: 7
Not a string

Process finished with exit code 0


**/


