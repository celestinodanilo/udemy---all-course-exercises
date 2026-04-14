import java.util.Random;
import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = 4;
        int soma = 0;
        int[][] mat = new int[n][n];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                mat[i][j] = rand.nextInt(50) + 1;
                System.out.print(mat[i][j] + " ");
                soma += mat[i][j];
            }
            System.out.println();
        }
        System.out.println("Soma: " + soma);



    }
}