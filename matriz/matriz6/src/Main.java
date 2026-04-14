import java.util.Random;
import java.util.Scanner;
void main() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int m = 3;
        int n = 4;

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rand.nextInt(50) + 1;
                System.out.printf("%4d ", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------");
        int[][] trans = new int[n][m];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                System.out.printf("%4d ", trans[i][j]);
            }
            System.out.println();
        }


        sc.close();
    }

