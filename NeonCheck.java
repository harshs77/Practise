import java.util.Scanner;

public class NeonCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's a Neon number:");
        int num = scanner.nextInt();
        int square = num * num;
        int sumOfDigits = 0;

        while (square != 0) {
            int digit = square % 10; 
            sumOfDigits += digit;
            square /= 10;

        }

        if(sumOfDigits == num){
            System.out.println(num + "is a Neon Number");
        }else{
            System.out.println(num + "is not a Neon Number");
        }



    }
}
