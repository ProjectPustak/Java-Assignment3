import java.util.Scanner;

public class Qus26 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = mp.nextInt();
        
        int sn =0;
        int se =0;
        int so =0;

        while (n!=0){
            if(n<0){
                sn=sn+n;
            } else if (n%2==0) {
                se=se+n;
            }
            else {
                so=so+n;
            }
            n=mp.nextInt();
        }

        System.out.println("The sum of Nagetave number: "+sn);

        System.out.println("The Sum of a Even Number: "+se);

        System.out.println("The Sum of ODD number: "+so);
    }
}
