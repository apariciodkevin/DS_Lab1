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
        // Asks user to select an option
        System.out.println("Choose your option (1 for US metrics 2 for general metrics):");
        choice = sc.nextInt();
        // validates user input
        while (choice < 1 || choice > 2){
            System.out.println("WRONG OPTION!!");
            System.out.println("Choose your option (1 for US metrics 2 for general metrics);");
            choice = sc.nextInt();
        }

        if (choice == 1){
            // Create bmi class
            BMI obj = new BMI();
            System.out.println("Enter your weight in pounds");
            obj.setWeight(sc.nextDouble());

            System.out.println("Enter your height in feet");
            obj.set_height(sc.nextDouble());

            System.out.println("Your weight in pounds: " + obj.getWeight() + "lb");
            System.out.println("Your height in feet: " + obj.getHeight() + "ft");
            System.out.printf("BMI: %.2f", obj.getResultUS());


        }
    }


}
