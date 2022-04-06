import java.util.Scanner;
class Matadd{
    public static void main(String b[]){
        Scanner sc = new Scanner(System.in);
        int a1[][],a2[][],a3[][],i,j;
        a1 = new int[100][100];
        a2= new int[100][100];
        a3 = new int[100][100];
        System.out.println("\n------------MATRIX ADDITION------------:\n");
        System.out.println("\nEnter the elements of first array:\n");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nEnter the elements of second array:\n");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a2[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nEnter the elements of first array:\n");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a3[i][j]=a1[i][j]+a2[i][j];
                System.out.println(a3[i][j]);

            }
            System.out.println("\n");
        }
        
        
    }
}