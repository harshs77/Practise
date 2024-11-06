import java.util.Scanner;;

public class TaxCal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("Enter your income");
int income = sc.nextInt();
double taxPercentage;

        if (income <= 10000) {
            taxPercentage = 0;
        } else if (income <= 30000) {
            taxPercentage = 10;
        } else if (income <= 50000) {
            taxPercentage = 20;
        } else {
            taxPercentage = 30;
        }

        System.out.println("Your tax is:" +taxPercentage + "%");

    }
}