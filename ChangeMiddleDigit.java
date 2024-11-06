import java.util.Scanner; 

public class ChangeMiddleDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a three-digit number: ");
        int userInput = scanner.nextInt(); 

        if (userInput >= 100 && userInput <= 999) {

            int hundreds = userInput / 100;
            int ones = userInput % 10;            

            int newMiddleDigit = 5; 

            int newNumber = hundreds * 100 + newMiddleDigit * 10 + ones;

            System.out.println("You entered: " + userInput);
            System.out.println("After changing the middle digit: " + newNumber);
        } else {

            System.out.println("Invalid input! Please enter a three-digit number.");
        }

        
    }
}
