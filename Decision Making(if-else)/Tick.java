import java.util.Scanner;

public class Tick{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double ticketPrice = 100.0;

System.out.println("Enter your Age:");
int age = sc.nextInt();

if(age < 12){
    ticketPrice *= 0.5;
    System.out.println("You get 50% discount! ");
}else if(age >=65){
    System.out.println("You get 30% Dicount!");
}else{
    System.out.println("No Discount applicable");
}

System.out.printf("Your ticket price is: %.2f\n", ticketPrice);

    }
}