public class CommitCafe {

<<<<<<< HEAD
    private static String barista = "CoffeeBot"; // STUDENT_TODO_1A: Change name
    private static String title = "[Lead Barista]"; // STUDENT_TODO_1B: Add a nickname or title for the barista
=======
    private static String barista = "Jason"; //Change name
    //Add a nickname or title for the barista
    private static String nickname = "Jace";
>>>>>>> brew

    private static int cups = 0;

    public static void brew(String drink) {
<<<<<<< HEAD
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". I like my IDE like my coffee: dark theme, no sugarcoating.");
        System.out.println("[BOT CHECK] drink length = " + drink.length()); // STUDENT_TODO_2B: Add a second brew-related improvement
=======
        // Implement - add 1 to cups & print a message
        cups++;
        System.out.println("Making " + drink);
        // Add a second brew-related improvement
        System.out.println(nickname + " has finished making your dirnk");
>>>>>>> brew
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
