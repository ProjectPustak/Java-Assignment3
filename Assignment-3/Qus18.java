import java.util.Scanner;

public class Qus18 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        //Future Investment Value: -

        System.out.println("Enter the amount of money invested");

        int inv = mp.nextInt();

        System.out.println("Enter the interest Rate: ");

        int r = mp.nextInt();

        System.out.println("Number of Periods");
        int n = mp.nextInt();

        double interst = r*0.01;


        double fi = inv*Math.pow((1+interst),n);

        System.out.println("The Future Investment Value: "+fi);
    }
}
