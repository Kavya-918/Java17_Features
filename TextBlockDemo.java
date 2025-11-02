public class TextBlockDemo {
    public static void main(String[] args) {

        //  Before Text Blocks (Old Way)
        String jsonOld = "{\n" +
                "    \"name\": \"KavyaDeveloper\",\n" +
                "    \"project\": \"BugTracker System\",\n" +
                "    \"role\": \"Developer\"\n" +
                "}";

        // After Text Blocks (Java 15+, stable in Java 17)
        String jsonNew = """
                {
                    "name": "KavyaDeveloper",
                    "project": "BugTracker System",
                    "role": "Developer"
                }
                """;

        System.out.println("Before Text Block:\n" + jsonOld);
        System.out.println("\nAfter Text Block:\n" + jsonNew);
    }
}

/**
"C:\Program Files\Java\jdk-17.0.4\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.5\lib\idea_rt.jar=59012" -Dfile.encoding=UTF-8 -classpath D:\Java17\out\production\Java17 TextBlockDemo
Before Text Block:
{
    "name": "KavyaDeveloper",
    "project": "BugTracker System",
    "role": "Developer"
}

After Text Block:
{
    "name": "KavyaDeveloper",
    "project": "BugTracker System",
    "role": "Developer"
}


Process finished with exit code 0


**/
