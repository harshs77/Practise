import java.util.Scanner;

public class FourDigitInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a four-digit number:");
int userInput = scanner.nextInt();


if(userInput >= 1000 && userInput <= 9999 ){
    System.out.println("You entered:" + userInput);

    int thousands = userInput / 1000;       
    int hundreds = (userInput / 100) % 10;  
    int tens = (userInput / 10) % 10;       
    int ones = userInput % 10;              

    System.out.println(thousands);
    System.out.println(hundreds);
    System.out.println(tens);
    System.out.println(ones);
}else{
    System.out.println("Invalid input! Please enter a four-digit number");


}

    }
}
