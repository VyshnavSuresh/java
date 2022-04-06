import java.util.Scanner;
class Matsy{
    public static void main(String b[]){
        Scanner sc = new Scanner(System.in);
        int a1[][],a2[][],a3[][],i,j;
        a1 = new int[100][100];
        a2= new int[100][100];
        a3 = new int[100][100];
        System.out.println("\n------------MATRIX ADDITION------------:\n");
        System.out.println("\nEnter the elements of first Mat:\n");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a1[i][j]=sc.nextInt();
            }
        }
        int k=3,p=3,f=1;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(a1[i][j]!=a1[k][p]){
                    f=1;
                    break;
                }
                p--;
            }
            k--;
        }
        if(f==1){
            System.out.println("\nThe Matrix is not transpose:\n");
        }else{
            System.out.println("\nThe Matrix is transpose:\n");
        }
        
        
    }
}