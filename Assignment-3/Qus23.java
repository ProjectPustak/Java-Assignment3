import java.util.Scanner;

public class Qus23 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the Year: ");

        int year  = mp.nextInt();

        if(year%4==0){
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("This is Not a Leap Year");
        }
    }
}
