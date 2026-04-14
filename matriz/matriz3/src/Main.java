void main() {
    Scanner sc = new Scanner(System.in);

    int n = 5;

    int[][] mat = new int[n][n];

    for(int i = 0; i<mat.length; i++){
        for(int j = 0; j<mat.length; j++){
            mat[i][j] = sc.nextInt();
        }
    }
    int maior = mat[0][0];
    int linhaMaior = 0;
    int colunaMaior = 0;

    for(int i = 0; i < mat.length; i++){
        for(int j = 0; j < mat[i].length; j++){
            if(mat[i][j] > maior){
                maior = mat[i][j];
                linhaMaior = i;
                colunaMaior = j;
            }
        }
    }
    System.out.println("Maior valor: " + maior);
    System.out.println("Posição: linha " + linhaMaior + ", coluna " + colunaMaior);
}
