package application;
import entities.funcionario;
import  java.util.Locale;
import  java.util.Scanner;
import static entities.funcionario.liquido;

public class Main {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");

        funcionario.name = sc.nextLine();
        System.out.println("Salario: ");
        funcionario.salario = sc.nextDouble();
        System.out.println("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println("Funcionario: "+ funcionario.name + ", " + liquido());
        System.out.println("Qual a porcentagem para almentar seu salario? ");
        funcionario.porcentagem = sc.nextDouble();
        System.out.println("Dados atualizados: " + funcionario.name + ", $" + funcionario.salario);




    }
}