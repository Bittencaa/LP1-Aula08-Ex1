import java.util.Scanner;

public class Calculator {
    int area;

    public int areaQuadrado(int lado) {
        area = lado * lado;
        System.out.println("A área do quadrado é: " + area);
        return area;
    }
}
