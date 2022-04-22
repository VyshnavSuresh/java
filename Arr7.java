public class Arr7 {
    public static void main(String a[]) {
        int ar[] = { 1, 3, 2, 4, 2, 3 }, k = 1;
        for (int i = 0; i < 6; i++)
            if (ar[i] % 2 == 0) {
                System.out.println("Even------" + ar[i]);
            } else {
                System.out.println("Odd-------" + ar[i]);
            }

    }

}
