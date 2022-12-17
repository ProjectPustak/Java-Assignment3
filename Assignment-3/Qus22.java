import java.util.Scanner;

public class Qus22 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = mp.nextInt();

        int n = num;


        int sum = 0;

        for (int i =1; i<=num/2 ; i++) {
            if(num%i==0){
                sum=sum+i;
            }

        }
        if (sum==n){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("This is Not a Perfect Number");
        }

    }
}
