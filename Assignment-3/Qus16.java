import java.util.Scanner;

public class Qus16 {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String s1 = mp.nextLine();

        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        System.out.println("Reverse String is:>"+s2);
    }
}
