import java.util.Scanner;

public class Arr12 {

    public static void main(String a[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        String k = s.nextLine();
        String ar[] = { "hello", "car", "bike", "bus" };
        for (int i = 0; i < 4; i++) {
            if (ar[i] == k) {
                System.out.println("fOUND AT POS:" + i);
            }
        }
    }
}
