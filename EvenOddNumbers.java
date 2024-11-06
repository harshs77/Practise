import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        System.out.println("Even numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 


        System.out.println("Odd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);

        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);


        System.out.print("Enter the start of the range for even numbers: ");
        int startEven = scanner.nextInt();
        System.out.print("Enter the end of the range for even numbers: ");
        int endEven = scanner.nextInt();
        System.out.println("Even numbers between " + startEven + " and " + endEven + ":");
        for (int i = startEven; i <= endEven; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Enter the start of the range for odd numbers: ");
        int startOdd = scanner.nextInt();
        System.out.print("Enter the end of the range for odd numbers: ");
        int endOdd = scanner.nextInt();
        System.out.println("Odd numbers between " + startOdd + " and " + endOdd + ":");
        for (int i = startOdd; i <= endOdd; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int sumEvenRange = 0;
        for (int i = startEven; i <= endEven; i++) {
            if (i % 2 == 0) {
                sumEvenRange += i;
            }
        }
        System.out.println("Sum of even numbers between " + startEven + " and " + endEven + ": " + sumEvenRange);

        int sumOddRange = 0;
        for (int i = startOdd; i <= endOdd; i++) {
            if (i % 2 != 0) {
                sumOddRange += i;
            }
        }
        System.out.println("Sum of odd numbers between " + startOdd + " and " + endOdd + ": " + sumOddRange);


    }
}
