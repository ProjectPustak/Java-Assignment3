import java.util.Scanner;

public class Qus21 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);
        System.out.println("Enter the Word: ");

        char ch = mp.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("The Is a VOWEL");
        }
        else {
            System.out.println("This is Consonant");
        }
    }
}
