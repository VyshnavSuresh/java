import java.util.Scanner;

public class CO14 {
	public static void main(String aR[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Row \t: ");
		int row = sc.nextInt();
		System.out.print("Enter the size of Cols \t: ");
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		boolean yes = true;
		int i, j;
		System.out.print("Enter elements of the matrix\t: ");
		if (row == col) {
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {

					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("\nMatrix A :");
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println("\n");
			}
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					if (a[i][j] != a[j][i]) {
						yes = false;
					}
				}
			}
			if (yes) {
				System.out.println("The Matrix is Symmetric\n");
			} else
				System.out.println("The Matrix is NOT Symmetric\n");
		} else
			System.out.println("The Rows and Columns are NOT equal.");
	}
}