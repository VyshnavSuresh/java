
import java.util.*;

public class Arr11 {

    public static void main(String a[]) {

        int y = 0;
        String s = "java", k = "abcdefghijklmnopqrstuvwxyz";
        char v[] = s.toCharArray();
        char p[] = k.toCharArray();
        int i = 0;
        System.out.println("Sorting a string char");
        do {
            for (int j = 0; j < v.length; j++)
                if (p[i] == v[j])
                    System.out.println(p[i]);
            i++;
            y = y + 1;
        } while (i < 26 || y < v.length);

    }
}
