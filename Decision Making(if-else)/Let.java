import java.util.Scanner;

public class Let{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's score (0-100):");
        int score = sc.nextInt();

        char grade;

        if(score >=90 && score <= 100 ){
            grade = 'A';
        }else if(score >=80){
            grade = 'B';
        }else if(score >=70){
            grade = 'C';
        }else if(score >=60){
            grade = 'D';
        }else if(score >=0){
            grade = 'F';
        }else{
            System.out.println("Invalid score. Please enter a score Between 0 and 100");
            return;
        }

        System.out.println("The letter grade is: " + grade);

    }
}