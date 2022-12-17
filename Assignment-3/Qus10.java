import java.util.Scanner;

public class Qus10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Full Marks: ");

        int fm = inp.nextInt();

        float percentage = 0;

        double cgpa = 0;

        int num;

        int sum = 0;
        System.out.println("How Many Subject you have?");
        int n = inp.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println("Enter the Numbers: ");
            sum = sum+inp.nextInt();
            i++;


        }
        percentage = (sum*100)/fm;

        cgpa = percentage/10;

        System.out.println("The Percentage is: "+cgpa);






    }
}
