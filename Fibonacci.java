import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no. to check the fibonacci series");
        int number = scanner.nextInt();

        int first = 0,second = 1;
        
        System.out.println("Fibonacci series:\n" + first + " " +  " "  + second );


        for(int i=3;i<=number;i++){
int next = first + second;
System.out.println( " "+ next);
first = second;
second = next;


        }


    }
}
