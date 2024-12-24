package exercises;

import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String matricula = sc.next();
        System.out.println("Digite a sua nota do primeiro semestre: ");
        double notaAluno1 = sc.nextDouble();
        System.out.println("Digite a sua nota do seguindo semestre: ");
        double notaAluno2 = sc.nextDouble();
        System.out.println("Digite a sua nota do terceiro semestre: ");
        double notaAluno3 = sc.nextDouble();
        System.out.println("Digite a sua nota do quarto semestre: ");
        double notaAluno4 = sc.nextDouble();

        ALuno alunoTest = new ALuno();

        alunoTest.setMatriculaAluno(matricula);

        alunoTest.setNotaAluno(notaAluno1);
        alunoTest.setNotaAluno2(notaAluno2);
        alunoTest.setNotaAluno3(notaAluno3);
        alunoTest.setNotaAluno4(notaAluno4);

        System.out.println(alunoTest);
    }
}
