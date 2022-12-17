import java.util.Scanner;

public class Qus17 {

    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the Number:");

        int num = mp.nextInt();


        int rem =0;

        int temp;

        temp=num;

        int ans =0;
        while (num>0){
            rem = num%10;
            num=num/10;
            ans =ans*10+rem;
        }
        if(temp==ans){
            System.out.println("This is Palindrom");
        }
        else {
            System.out.println("Not A Palindrom");
        }
    }
}
