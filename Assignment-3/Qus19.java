import java.util.Scanner;

public class Qus19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while (num1%num2!=0){
            int rem = num1 % num2;
            num1=num2;
            num2=rem;
        }

        int gcd = num2;
        System.out.println("The HCF is:"+gcd);
    }
}
