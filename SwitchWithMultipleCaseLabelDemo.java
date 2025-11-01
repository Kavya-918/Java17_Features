public class SwitchWithMultipleCaseLabelDemo {

    public static void beforeJava17MultipleCaseValue(int number){
        switch(number){
            case 1:
                System.out.println("one");
                break;
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("two,three,four");

            case 2:
            case 3:
            case 4:
            {   // optional block to group multiple statements
                System.out.println("two, three, four");
                System.out.println("Handled in old switch");
            }
            break;

            default:
                System.out.println("Unknown");
                break;
        }
    }

    public static void java17WithMultipleCaseValue(int number){
        switch (number){
            case 1 -> System.out.println("one");
//            case 2,3,4 -> System.out.println("two,three,or four");
            case 2, 3, 4 -> {
                System.out.println("two, three, or four");
                System.out.println("This executes multiple statements");
            }
            default -> System.out.println("unknow");
        }
    }

    public static void main(String[] args) {
        System.out.println("Before Java 17 Version");
        beforeJava17MultipleCaseValue(2);
        beforeJava17MultipleCaseValue(3);
        beforeJava17MultipleCaseValue(4);

        System.out.println("Java 17 Version");
        java17WithMultipleCaseValue(2);
        java17WithMultipleCaseValue(3);
        java17WithMultipleCaseValue(4);
    }

}
