import java.util.Scanner;

public class Qus13 {

    public static void main(String[] args) {
        Scanner inp  =new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int n = inp.nextInt();

        int sum = 0;

        while (n!=0){
            sum =sum+n;
            System.out.println("Enter the number:");

            n =inp.nextInt();
        }

        System.out.println("The Sum of All this NUmber is "+sum);
    }
}
