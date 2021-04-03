
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputs = 0;
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0) {
                break;
            }
            if (userInput > 0) {
                sum += userInput;
                inputs++;
            }
        }
        if (inputs == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0 * sum / inputs;
            System.out.println(average);
        }

    }
}
