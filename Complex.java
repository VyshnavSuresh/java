import java.util.Scanner;
class Complex{
    int real,img;
    Complex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the real part:\n");
        real =sc.nextInt();
        System.out.println("\nEnter the imaginary part:\n");
        img =sc.nextInt();
    }
    public static void main(String b[]){
        Scanner sc = new Scanner(System.in);
        Complex a1=new Complex(),a2=new Complex();
        int sum =a1.real+a2.real;
        int sumi=a1.img+a1.img;
        System.out.println("\nThe sum of complex numbers "+a1.real+"+"+a1.img+"i and"+a2.real+"+"+a2.img+"i:"+sum+"+"+sumi+"i\n");
        

    }
}