import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Start off the program by asking user if they want their data in metric or imperial system."
        options();

    }

    // Functions
    // Check for input validity
    static void options(){
        // Initialize scanner for user input.
        Scanner sc = new Scanner(System.in);

        // variable choice holds the user selection.
        int choice;

        do {
            System.out.println("Choose your option (1 for US metrics, 2 for general metrics");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 2);

    }
}
