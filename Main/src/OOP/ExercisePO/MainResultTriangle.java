package OOP.ExercisePO;

import java.util.Scanner;

public class MainResultTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        double largura = sc.nextDouble();

        MainTriangle newMainTriangle = new MainTriangle(altura, largura);

        System.out.println("A altura do triangulo é: "+newMainTriangle.getAltura());
        System.out.println("A largura do triangulo é: "+newMainTriangle.getLargura());

        System.out.println();
        System.out.println("A área do triangulo é: "+newMainTriangle.calcularAreaTriangle());
        System.out.println("A diagonal do triangulo retangulo é: "+newMainTriangle.calcualarDiagonal());

        System.out.println();
        System.out.println("O perimetro dese triangulo retangulo é: "+newMainTriangle.cacularPerimetro(largura, altura));


        sc.close();
    }
}

