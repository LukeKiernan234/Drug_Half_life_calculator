import java.util.Scanner;

public class halflife{
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a dose in MG
        System.out.print("Enter a dose in MG: ");
        String userDose = scanner.nextLine();

        // Prompt the user to enter a half-life in hours
        System.out.print("Enter a half-life in hours: ");
        String userHalfLife = scanner.nextLine();

        // Convert the user inputs to float
        float dose = Float.parseFloat(userDose);
        float halfLife = Float.parseFloat(userHalfLife);

        // Calculate the drug's half-life after 1 day (24 hours)
        float halfLifeAfter1Day = halflife(dose, halfLife, 24);

        for(int i = 0; i < 5; i++){
            System.out.println("The drug's half-life after " + i + " day is: " + halflife(dose, halfLife, i * 24) + " MG");
        }

        // Close the scanner to release resources
        scanner.close();
    }

    public static float halflife(float dose, float halfLife, float timeInHours) {
        // Calculate the remaining dose using the formula: Remaining Dose = Initial Dose * (1/2)^(time / half-life)
        float remainingDose = dose * (float) Math.pow(0.5, (timeInHours / halfLife));
        return remainingDose;
    }
}
