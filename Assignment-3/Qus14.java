import java.util.Scanner;

public class Qus14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int num = inp.nextInt();

        int sum = 0;

        int temp;

        temp=num;

        while (num>0){
            int rem = num%10;



            sum = sum+(rem*rem*rem);

            num = num/10;


        }

        System.out.println("This is a ArmStrong Value"+sum);
        if(sum==temp){
            System.out.println("This a Armstrong Number.");
        }

        else {
            System.out.println("This is Not a ArmStrong Number");
        }
    }
}
