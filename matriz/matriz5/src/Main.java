void main() {
    Scanner sc = new Scanner(System.in);
    int m = 3;
    int n = 4;
    int soma = 0;
    Random rand = new Random();
    int[][] mat = new int[m][n];

    for(int i = 0; i<mat.length; i++){
        for(int j = 0; j<mat[i].length; j++){
            mat[i][j] = rand.nextInt(100)+1;
            System.out.print(mat[i][j]+ " ");
        }
        System.out.println();
    }
    for(int i = 0; i<mat.length; i++){
        for(int j = 0; j<mat[i].length; j++) {
            soma += mat[i][j];
        }
        System.out.println(soma);
    }





    }

