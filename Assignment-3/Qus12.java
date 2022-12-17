import java.util.Scanner;

public class Qus12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Number:");

        int n = inp.nextInt();

        int sum=0;
        double avg = 0;
        int count =0;
        while (n!=0){

            sum=sum+n;
            System.out.println("Enter the Number:");
            n =inp.nextInt();
            count++;


        }
        avg =sum/count;

        System.out.println(avg);

    }
}
