import java.util.Scanner;

public class Qus15 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the N  value: ");

        int n = mp.nextInt();

        System.out.println("Enter the R value: ");

        int  r = mp.nextInt();

        int i =1;

        int ncr =1;

        int npr =1;

        while (i<=r){
            ncr=(ncr*n)/i;

            npr =npr*n;

            i++;
            n--;
        }
        System.out.println("The Ncr of the Number is: "+ncr);
        System.out.println("The NPR of the Number is: "+npr);
    }
}
