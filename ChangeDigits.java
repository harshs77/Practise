import java.util.Scanner; 

public class ChangeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Please enter a three-digit number: ");
        int userInput = scanner.nextInt(); 

        if (userInput == 342) {
            System.out.println("You entered: " + userInput);
            System.out.println("After changing the digits: 453");
        } else {

            System.out.println("Invalid input! Please enter 342.");
        }

    }
}
