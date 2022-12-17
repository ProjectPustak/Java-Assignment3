import java.util.Scanner;

public class Qus4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Price of the Product:- ");

        int p = sc.nextInt();

        System.out.println("Enter the Discount Percentage: ");

        int d = sc.nextInt();
        float td = p-(d*0.01f)*p;

        System.out.println("Total Discount is: "+td);
    }
}
