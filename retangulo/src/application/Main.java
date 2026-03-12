package application;
import entities.retangulo;

import java.awt.geom.Area;
import java.sql.SQLOutput;
import java.util.Scanner;
import  java.util.Locale;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        retangulo a = new retangulo();

        System.out.println("Qual a largura do retangulo: ");
        a.largura = sc.nextDouble();
        System.out.println("Qual a altura do retangulo: ");
        a.altura = sc.nextDouble();


        System.out.println("AREA = " + a.Area());
        System.out.println("PERIMETRO = " + a.Perimetro());
        System.out.println("DIAGONAL = " + a.Diagonal());







    }
}