public class HouseholdDetails {
    public static void main(String[] args) {
        // Declaring variables with suitable data types
        int familyMembers = 5;          // Number of family members
        double waterConsumed = 245.75;  // Water consumed in litres
        int houseNumber = 101;          // House number
        char usageStatus = 'A';         // Water usage status (e.g., 'A' = Active, 'I' = Inactive)

        // Displaying the details
        System.out.println("Household Details:");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed (litres): " + waterConsumed);
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + usageStatus);
    }
}import java.util.Scanner;

public class WaterConsumption {
    
    // Method to calculate total consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read morning usage
        System.out.print("Enter morning water usage (litres): ");
        int morningUsage = scanner.nextInt();

        // Read evening usage
        System.out.print("Enter evening water usage (litres): ");
        int eveningUsage = scanner.nextInt();

        // Call method to calculate total
        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        // Display result
        System.out.println("Total water consumption: " + totalConsumption + " litres");
    }
}
import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        int consumption = sc.nextInt();

        int bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill = Rs." + bill);

        sc.close();
    }
}