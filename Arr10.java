public class Arr10 {
    public static void main(String a[]) {

        int ar[] = { 1, 3, 2, 4, 2, 3 }, k = 1;
        System.out.println("Repeated elements are:");
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++)
                if (ar[i] == ar[j]) {
                    System.out.println(ar[i]);
                }

        }
    }
}
