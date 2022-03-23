import java.util.Scanner;

public class Am {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int k, n, r, s = 0;
        System.out.println("Enter the number");
        n = sc.nextInt();
        k = n;
        while (n > 0) {
            r = n % 10;
            s = s + r * r * r;
            n = n / 10;
        }
        if (s == k) {
            System.out.println(s + "IS AMSTRNG NUMBER");
        } else {
            System.out.println(s + "IS NOT AN AMSTRNG NUMBER");
        }
    }
}
