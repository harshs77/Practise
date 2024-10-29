import java.util.Scanner;

public class Res {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Welcome to our restaurant!");
        System.out.println("Please select an item from the menu:");
        System.out.println("1. Burger - Rs.40 ");
        System.out.println("2. Pizza - Rs.150");
        System.out.println("3. Pasta - Rs.80");
        
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("You selected Burger. Price:Rs.40 ");
        }else if(choice == 2){
            System.out.println("You selected Pizza. Price:Rs.150 ");

        }else if(choice == 3){
            System.out.println("You selected Paste. Price:Rs.80 ");
        }else{
            System.out.println("Invalid choice. Please select a number between 1 and 3.");
        }


        
    }
}
