import java.util.Scanner;

public class Qus9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Batting Average = Runs Scored ÷ Times Out
        System.out.println("Enter the Runs Scored: ");

        int rs = sc.nextInt();

        System.out.println("Enter the Times Out: ");

        int to = sc.nextInt();

        int ba = rs/to;

        System.out.println("The Batting Average: "+ba);
    }
}
