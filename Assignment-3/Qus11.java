import java.util.Scanner;

public class Qus11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Principle balance: ");

        int p = inp.nextInt();

        System.out.println("Enter the Interst Rate: ");

        int r = inp.nextInt();

        System.out.println("Number of times interest applied per time period");

        int n = inp.nextInt();

        double tm = Math.pow(p*(1+r*0.01),n);

        double ci = tm-p;

        System.out.println("The Compound Interst is: "+ci);
    }
}
