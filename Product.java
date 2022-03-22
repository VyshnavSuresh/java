import java.util.Scanner;

class product {
    public static int item() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product details");
        System.out.println("\nEnter the product code");
        String pcode = s.nextLine();
        System.out.println("\nEnter the product name");
        String pname = s.nextLine();
        System.out.println("\nEnter the product price");
        int pprice = s.nextInt();
        return pprice;

    }
}

class hello {
    public static void main(String kp[]) {
        Scanner s = new Scanner(System.in);
        product j = new product();
        product k = new product();
        product v = new product();
        int a = j.item();
        int b = k.item();
        int c = v.item();
        if (a > b) {
            if (a > c) {
                System.out.println("Highest Price" + a);
            } else {
                if (b > c) {
                    System.out.println("Highest Price" + b);
                } else {
                    System.out.println("Highest Price" + c);
                }
            }
        } else {
            if (b > c) {
                System.out.println("Highest Price" + b);
            } else {
                System.out.println("Highest Price" + c);
            }
        }

    }
}