import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Watt");
        int watt = inp.nextInt();
        float kw = watt*0.001f;

        System.out.println("Hours Use Per Day: ");

        int hr = inp.nextInt();

        System.out.println("Enter 1kWh cost: ");

        int cost = inp.nextInt();

        float uses = kw*hr*30.0f;

        float bill = uses*cost;

        System.out.println("The Elecsity bill is "+bill);


    }
}
