    import javax.xml.transform.Source;
    import java.util.Scanner;
    import java.util.Locale;


    public class estruturarepetitivaFOR {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Numero 1 - impar");
            System.out.println("Numero 2 - intervalo");
            System.out.println("Numero 3 - teste");
            System.out.println("Numero 4 - pares");
            System.out.println("Numero 5 - divisores");
            System.out.println("Numero 6 - linhas");
            System.out.println("Escolha um codigo a ser execultado: ");

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    impar();
                    break;
                case 2:
                    intervalo();
                case 3:
                    teste();
                case 4:
                    pares();
                case 5:
                    divisores();
                case 6:
                    linha();
            }
        }




            public static void impar(){


            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um numero de 1 a 1000: ");
                int n = sc.nextInt();
                if ( n <= 1 ){
                    System.out.println("Numero invalido");
                }
                else if (n > 1000){
                    System.out.println("Numero invalido");
                }

                for(int i = 0; i<n; i++){
                    if (i % 2 !=0){
                        System.out.println(i);
                    }
                }

        }

            public static void intervalo() {

                Scanner sc = new Scanner(System.in);

                System.out.println("Quantos numeros quer digitar? ");
                int n = sc.nextInt();

                int in = 0;
                int out = 0;


                for (int i = 0; i < n; i++) {
                    System.out.println("Digite um numero: ");
                    int x = sc.nextInt();

                    if (x >= 10 && x <= 20) {
                        in = in + 1;
                    } else {
                        out = out + 1;
                    }
                }
                System.out.println(in + " in");
                System.out.println(out + " out");




        }
        public static void teste() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Quantos casos de teste você quer? ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Digite três numeros para cada teste");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
                System.out.printf("%.1f%n", media);
            }
        }


            public static void pares(){

            Scanner sc = new Scanner(System.in);
                System.out.println("Quantos testes de divisão entre numeros pares você quer? ");
            int n = sc.nextInt();

            for (int i = 0; i<n; i++){
                System.out.println("Digite os numeros pares: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                int divisao = (a / b);
                    if(divisao == 0 ){
                        System.out.println("Divisão impossivel");
                    }
                    else{
                        System.out.println(divisao);
                    }



                }




            }

            public static void divisores(){

            Scanner sc = new Scanner(System.in);
                System.out.println("Digite somente numeros inteiros: ");
            int n = sc.nextInt();

            for (int i = 1; i <=n; i++){
                if ( n % i == 0){
                    System.out.println(i);
                }
            }

            }

        public static void linha(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Escreva um valor inteiro positivo: ");
            int n = sc.nextInt();

            for (int i = 1; i<=n; i++){
                int primeiro = i;
                int quadrado = i * i;
                int cubo = i * i * i;
                System.out.printf("%d %d %d%n", primeiro, quadrado, cubo);

            }



        }


}























