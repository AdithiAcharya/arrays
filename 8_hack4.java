import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckTour {

    public static int truckTour(List<List<Integer>> petrolpumps) {
        int totalPetrol = 0;
        int totalDistance = 0;
        int currentPetrol = 0;
        int startingPumpIndex = 0;

        for (int i = 0; i < petrolpumps.size(); i++) {
            totalPetrol += petrolpumps.get(i).get(0);
            totalDistance += petrolpumps.get(i).get(1);
            currentPetrol += petrolpumps.get(i).get(0) - petrolpumps.get(i).get(1);

            // If currentPetrol is negative, reset starting point to the next pump
            if (currentPetrol < 0) {
                startingPumpIndex = i + 1;
                currentPetrol = 0;
            }
        }

        // Check if the total petrol is enough to cover the total distance
        return (totalPetrol >= totalDistance) ? startingPumpIndex : -1; // -1 indicates no solution
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        List<List<Integer>> petrolpumps = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] petrolpumpsRowTemp = scanner.nextLine().trim().split(" ");
            List<Integer> petrolpumpsRow = new ArrayList<>();
            petrolpumpsRow.add(Integer.parseInt(petrolpumpsRowTemp[0]));
            petrolpumpsRow.add(Integer.parseInt(petrolpumpsRowTemp[1]));
            petrolpumps.add(petrolpumpsRow);
        }

        int result = truckTour(petrolpumps);
        System.out.println(result);
        scanner.close();
    }
}
