import java.util.Scanner;

public class Palin {
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        int r,rev=0,n,k;
        System.out.println("Enter the number");
        n=sc.nextInt();
        k=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(k==rev){
            System.out.println("Yes the given number"+ k+"is a palindrome");

        }else{
            System.out.println("No the given number is"+ k+" not a palindrome")
        }
    }
}
