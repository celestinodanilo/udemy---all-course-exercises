//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int n = 4;
    int[][] mat = new int[n][n];

    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            mat[i][j] = sc.nextInt();
        }
    }
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            if (i == j) {
                if (mat[i][j] != 1) {
                    System.out.println("Não é");
                    return;
                }
            } else if (mat[i][j] != 0) {
                System.out.println("Não é");
                return;
            }

        }
    }
    System.out.println("É");}



