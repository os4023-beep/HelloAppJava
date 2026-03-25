public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build names with delimiter
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = nameBuilder.toString();
        if (names.length() > 0) {
            names = names.substring(0, names.length() - 2);
        }

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}