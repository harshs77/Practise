import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = scanner.nextInt();
        int temp = num;
        int rem = 0;

        while (num != 0) {
            int n = num % 10;        
            rem = rem + (n * n * n);
            num = num / 10;         
        }
        
        if (temp == rem) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
        
    
    }
}
