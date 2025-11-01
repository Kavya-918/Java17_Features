import java.util.Scanner;

public class SwitchDemo {

    public static void beforeJava17SwitchStatement(int number){
        String result;
        switch (number){
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            default:
                result = "unknown";
                break;

        }
        System.out.println("Before Java17 = " + result);
    }


    public static void java17SwitchStatement(int number){
        String value = switch (number){
            case 1 -> "One";
            case 2 -> "Two";
            default -> "Unknow";
        };
        System.out.println("Java17 = " + value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        beforeJava17SwitchStatement(num);
        java17SwitchStatement(num);
    }
}




/** output

"C:\Program Files\Java\jdk-17.0.4\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.5\lib\idea_rt.jar=62590" -Dfile.encoding=UTF-8 -classpath D:\Java17\out\production\Java17 SwitchDemo
Enter a number: 2
Before Java17 = two
Java17 = Two

Process finished with exit code 0

    **/
