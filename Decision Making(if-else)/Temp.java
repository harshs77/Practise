import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("Enter The Temp.");
double temperature = sc.nextDouble(); 
System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
char ch = sc.next().toUpperCase().charAt(0);

if(ch == 'C'){
    double fahrenheit = (temperature * 9 / 5) + 32;
System.out.printf("%.2f°C is %.2f°F\n", temperature, fahrenheit);
}else if(ch == 'F') {
    // Convert Fahrenheit to Celsius
    double celsius = (temperature - 32) * 5 / 9;
    System.out.printf("%.2f°F is %.2f°C\n", temperature, celsius);
} else {
    System.out.println("Invalid unit. Please enter C for Celsius or F for Fahrenheit.");
}



    }
}
