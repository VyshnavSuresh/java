import java.util.Scanner;

import javafx.scene.effect.DisplacementMap;

public class Arr14 {
    int eno, sal;
    String name;

    Arr14(int eno, int sal, String name) {

        this.eno = eno;
        this.sal = sal;
        this.name = name;
    }

    public void Disply() {
        System.out.println("Name:" + name);
        System.out.println("Salary:" + sal);
        System.out.println("Employee id" + name);

    }

    public static void main(String a[]) {
        int eno, sal;
        String name;
        System.out.println("Enter the Total no of employees");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Arr14[] j = new Arr14[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Employee id:");
            eno = s.nextInt();
            System.out.println("Enter the salary:");
            sal = s.nextInt();
            System.out.println("Enter the Name:");
            name = s.next();
            System.out.println("End");
            j[i] = new Arr14(eno, sal, name);
        }
        int f = 0;
        System.out.println("Enter the element to be searched:");
        String k = s.next();
        for (int i = 0; i < n; i++) {
            if (j[i].name == k) {
                System.out.println("eMPLOYEE FOUNND");
                f = 1;
                j[i].Disply();

            }
        }
        if (f == 0) {
            System.out.println("Element not found");
        }

    }
}