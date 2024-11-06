import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time of day (morning, afternoon, evening):");
        String timeOfDay = sc.next().toLowerCase(); 

        if (timeOfDay.equals("morning")) {
            System.out.println("Good morning!");
        } else if (timeOfDay.equals("afternoon")) {
            System.out.println("Good afternoon!");
        } else if (timeOfDay.equals("evening")) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Invalid input, please enter 'morning', 'afternoon', or 'evening'.");
        }

        sc.close();
    }
}
