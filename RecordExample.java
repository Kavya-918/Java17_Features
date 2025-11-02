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
