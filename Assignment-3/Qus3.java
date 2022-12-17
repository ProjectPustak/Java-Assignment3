import java.util.Scanner;

public class Qus3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:-");
        int sum = 0;
        double avg;
        int n = sc.nextInt();

        for (int i = 0; i<n ; i++) {
            sum = sum+sc.nextInt();
        }

        avg = sum/n;

        System.out.println("The Average is: "+avg);



    }
}
