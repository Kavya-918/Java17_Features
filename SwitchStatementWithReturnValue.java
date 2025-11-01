public class SwitchStatementWithReturnValue {

    // Method 1: Switch Expression returning String based on Object type
    static String formatter(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s  -> "String: " + s;
            case null      -> "Null Value";
            default        -> "Unknown Type";
        };
    }

    // Method 2: Switch Expression with Number classification
    static String classifyNumber(Number number) {
        return switch (number) {
            case Integer i -> i % 2 == 0 ? "Even Integer" : "Odd Integer";
            case Double d  -> d > 0 ? "Positive Double" : "Non-positive Double";
            default -> "Unknown Number";
        };
    }

    // Main method to test both
    public static void main(String[] args) {
        System.out.println(formatter(10));
        System.out.println(formatter("Kavyadeveloper"));
        System.out.println(formatter(null));
        System.out.println(formatter(3.14));

        System.out.println(classifyNumber(10));
        System.out.println(classifyNumber(7));
        System.out.println(classifyNumber(3.14));
        System.out.println(classifyNumber(-2.5));
    }
}




/** output

"C:\Program Files\Java\jdk-17.0.4\bin\java.exe" --enable-preview "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.5\lib\idea_rt.jar=51373" -Dfile.encoding=UTF-8 -classpath D:\Java17\out\production\Java17 SwitchStatementWithReturnValue
Integer: 10
String: Kavyadeveloper
Null Value
Unknown Type
Even Integer
Odd Integer
Positive Double
Non-positive Double

Process finished with exit code 0


    **/
