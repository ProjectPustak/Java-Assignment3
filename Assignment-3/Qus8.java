import java.util.Scanner;

public class Qus8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Present Value: ");

        int pv = inp.nextInt();

        System.out.println("Enter the Rate: ");

        int r= inp.nextInt();

        System.out.println("The The Time: ");

        int n = inp.nextInt();

        float fv = (float) (pv*(Math.pow((1+r*0.01f),n)));

        System.out.println("The Final Value is: "+fv);
    }
}
