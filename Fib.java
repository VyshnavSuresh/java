import java.util.Scanner;

class Fib {
    public static void main(String[] a) {
        int b = 0, c = 1, n, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        n = sc.nextInt();
        System.out.println("\nFibonacci num\n\n" + b + "\n" + c + "\n");
        for (int i = 0; i < n; i++) {
            d = b + c;
            System.out.println(d + "\n");
            b = c;
            c = d;
        }

    }
}