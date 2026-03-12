package entities;

public class funcionario {
    public static String name;
    public static double salario;
    public static double taxa;
    public static double porcentagem;


    public static double liquido(){
        return salario - taxa;
    }
    public void IncreaseSalary(){
        salario = salario + (salario * porcentagem / 100);
    }

}
