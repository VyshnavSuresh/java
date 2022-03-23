import java.util.Scanner;

public class Rev {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int rev = 0, b, r;
        System.out.println("Enter the number");
        b = sc.nextInt();
        while (b > 0) {
            r = b % 10;
            rev = rev * 10 + r;
            b = b / 10;
        }
        System.out.println("\n" + rev);

    }

}
