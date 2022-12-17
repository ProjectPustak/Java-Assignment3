import java.util.Scanner;

public class Qus5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter First Point Value: ");
        int x1 = inp.nextInt();
        int y1 = inp.nextInt();

        System.out.println("Enter Second Point Value: ");
        int x2 = inp.nextInt();
        int y2 = inp.nextInt();


        float distance =(float) Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));

        System.out.println("The Distance Between Two Point is: "+distance);


    }
}
