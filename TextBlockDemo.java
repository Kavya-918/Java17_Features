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
