import java.util.Scanner;

public class Noc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println("Enter the First Number:");
int num1 = sc.nextInt();

System.out.println("Enter the Second Number:");
int num2 = sc.nextInt();

if(num1 > num2){
    System.out.println(num1 + ":is graeter than: " + num2);
}else if(num1 < num2){
    System.out.println(num2 + ":is greater than:" + num1);
}else{
    System.out.println("Both numbers are equal");
}



    }
}
