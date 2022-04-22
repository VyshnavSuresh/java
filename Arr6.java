public class Arr6 {
    public static void main(String a[]) {

        int ar[] = { 1, 3, 2, 4, 2, 3 }, k = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++)
                if (ar[i] > ar[j]) {
                    k = ar[i];
                    ar[i] = ar[j];
                    ar[j] = k;
                }

        }
        System.out.println("Second largest no is:" + ar[4]);

    }
}
