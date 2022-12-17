import java.util.Scanner;

public class Qus7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n =inp.nextInt();
        int c =0;
        System.out.println("Enter the Power of the Number: ");
        int p = inp.nextInt();

        int product  =1;

        while (c!=p){
            product = product*n;
            c++;
        }
        System.out.println("The Power of the Number is: "+product);
    }
}
