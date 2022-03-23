import java.util.*;

public class Sdig {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int r, sum = 0, n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("\nThe sum of digits= " + sum);
    }

}
