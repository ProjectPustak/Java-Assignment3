import java.util.Scanner;

public class Qus6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Price of the Product: ");

        int p = sc.nextInt();

        System.out.println("Enter the Discount Of the Procuct: ");

        int d  = sc.nextInt();


        float commison = d*p/100;

        System.out.println("Your Commission is: "+commison);

    }
}
