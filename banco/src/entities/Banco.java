package entities;

public class Banco {
    private double sacar;
    private String nome;
    private int numero;
    private double deposito;

    public Banco(String name, int numero, double deposito) {
        this.nome = name;
        this.numero = numero;
        this.deposito = deposito;
    }

    public static void nome() {
    }

    public String getName() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getDeposito() {
        return deposito;
    }

    public void depositar(double deposito){
        this.deposito += deposito;
    }

    public void sacar(double deposito){
        this.deposito = this.deposito - deposito - 5;
    }

    public void setNome(String nome1) {
        this.nome = nome1;
    }

    public double sacar() {
        return 0;
    }
}

