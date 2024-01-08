import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of the entered matrix is:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[j][i] = a[i][j];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
