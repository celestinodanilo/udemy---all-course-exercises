package application;
import entities.Banco;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.println("Bem vindo ao nosso banco, vamos ao cadastro!\n");
        System.out.println("Informe um numero para sua conta: ");
        int numero = sc.nextInt();
        System.out.println("Qual o seu nome? ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Deseja começar depositando quanto? (não é obrigatorio)" );
        double deposito = sc.nextDouble();

        Banco banco = new Banco(nome, numero, deposito);


        System.out.println("Dados da conta:\n ");
        System.out.printf("Numero: %d, Nome: %s, Valor na conta: %.2f%n ",numero, banco.getName(), banco.getDeposito());


        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mudar nome");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            String nome1 = null;
            if (opcao == 1) {
                System.out.println("Valor:");
                double v = sc.nextDouble();
                banco.depositar(v);

            } else if (opcao == 2) {
                System.out.println("Valor:");
                double v = sc.nextDouble();
                double z = (v - banco.sacar());
                banco.sacar(v);

            } else if (opcao == 3) {
                sc.nextLine();
                System.out.println("Novo nome:");
                nome1 = sc.nextLine();
                banco.setNome(nome1);
            }
            System.out.println("Dados da conta atualizado: ");
            System.out.printf("Conta: %d, Nome: %s, Valor na conta: %.2f%n ",numero, banco.getName(), banco.getDeposito());
        }




            }


    }


