import java.util.Scanner;

public class Qus20 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the Number1: ");

        int num1 = mp.nextInt();

        System.out.println("Enter the Number2: ");

        int num2 = mp.nextInt();

        int n1 = num1;

        int n2 = num2;

        while (num1 % num2 !=0){
            int rem = num1%num2;

            num1=num2;
            num2=rem;
        }
        int gcd = num2;

        int lcm = (n1*n2)/gcd;

        System.out.println("The LCM of the Two Number is: "+lcm);
    }
}
