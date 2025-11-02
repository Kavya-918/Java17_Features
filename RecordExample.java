// Before Java 16 – Normal Class
class Person {
    private final String name;
    private final int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // toString()
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Java 16+ – Record Class (shorter version)
record PersonRecord(String name, int age) { }

public class RecordExample {
    public static void main(String[] args) {
        // Using normal class
        Person p1 = new Person("Krishkumar", 29);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1);

        // Using record class
        PersonRecord p2 = new PersonRecord("Krishkumar", 29);
        System.out.println(p2.name());   // auto getter
        System.out.println(p2.age());
        System.out.println(p2);          // auto toString()
    }
}


/*  
"C:\Program Files\Java\jdk-17.0.4\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.5\lib\idea_rt.jar=62796" -Dfile.encoding=UTF-8 -classpath D:\Java17\out\production\Java17 RecordExample
Krishkumar
29
Person{name='Krishkumar', age=29}
Krishkumar
29
PersonRecord[name=Krishkumar, age=29]

Process finished with exit code 0


*/
