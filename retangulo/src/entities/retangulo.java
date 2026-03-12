package entities;

import java.sql.PreparedStatement;

public class retangulo {
    public double largura;
    public double altura;


    public double Width(double largura) {
        return largura;
    }

    public double Height(double altura) {
        return altura;
    }

    public double Area() {
        return largura * altura;
    }

    public double Perimetro() {
        return largura * 2 + altura * 2;
    }

    public double Diagonal() {
        return Math.sqrt((largura * largura) + (altura * altura));
    }


}

