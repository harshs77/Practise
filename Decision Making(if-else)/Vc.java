import java.util.Scanner;

public class Vc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a Char");
char alphabet = sc.next().charAt(0);


if(alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U' ||  alphabet == 'a' || alphabet == 'e' || alphabet == 'i' ||
alphabet == 'o' || alphabet == 'u'){
    System.out.println("Vowel");
}else{
    System.out.println("Consonant");
}


    }
}
