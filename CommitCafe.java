public class CommitCafe {

    private static String barista = "Jason"; //Change name
    //Add a nickname or title for the barista
    private static String nickname = "Jace";

    private static int cups = 0;

    public static void brew(String drink) {
       // Implement - add 1 to cups & print a message
        cups++;
        System.out.println("Making " + drink);
        // Add a second brew-related improvement
        System.out.println(nickname + " has finished making your dirnk");
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