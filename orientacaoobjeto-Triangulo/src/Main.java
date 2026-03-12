
import entities.triangulo;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Coloque os valores do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Coloque os valores do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double px = (x.a + x.b  + x.c)/2;

        double areax = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c) );

        double py = (y.a + y.b + y.c)/2;
        double areay = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c) );



        System.out.printf("Area do triangulo X: %.4f%n", areax);
        System.out.printf("Area do triangulo y: %.4f%n", areay);

        if(areax > areay){
            System.out.println("Maior area: X");
        }   else{
            System.out.println("Maior area: Y");
        }





    }
}