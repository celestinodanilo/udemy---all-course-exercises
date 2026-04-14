import java.util.Scanner;
import java.util.Random;

void main() {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int par = 0;
    int impar = 0;

    int[][] mat = new int[n][n];

    for(int i = 0; i<mat.length; i++){
        for(int j = 0; j<mat[i].length; j++){
            mat[i][j] = rand.nextInt(50)+1;
        }
    }
    for(int i = 0; i<mat.length; i++){
        for(int j = 0; j<mat[i].length; j++){

            if (mat[i][j] % 2 ==0){
                par ++;
            } else {
                impar ++;
            }
        }
        System.out.println();
    }
    System.out.println("Números pares: " + par);
    System.out.println("Números ímpares: " + impar);
}
