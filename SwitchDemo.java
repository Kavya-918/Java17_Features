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
