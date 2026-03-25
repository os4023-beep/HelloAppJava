public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all names with ", "
        String names = String.join(", ", args);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}