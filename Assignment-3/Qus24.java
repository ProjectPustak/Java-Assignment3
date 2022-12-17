import java.util.Scanner;

public class Qus24 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int  num  = mp.nextInt();

        int sum =0;

        while (num>0){
            int rem = num%10;

            sum = rem+sum;

            num=num/10;
        }
        System.out.println("The Sum of Digits is: "+sum);
    }
}
