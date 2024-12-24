package exercises;

/*

Descrição: Crie uma classe Aluno que armazena o nome, matrícula
e as notas de um aluno. Use encapsulamento para proteger as notas
e permita que sejam alteradas apenas por métodos que realizem validações.

Funcionalidades:

Métodos para calcular a média das notas.
Método para verificar se o aluno foi aprovado (média >= 7).
Método para adicionar ou atualizar notas.


 */

public class ALuno {
 private String matriculaAluno;
 private double notaAluno;
 private double notaAluno2;
 private double notaAluno3;
 private double notaAluno4;


    public double calcularMediaAluno(double nota ) {
     double nota1 = getNotaAluno(), nota2= getNotaAluno2(), nota3=getNotaAluno3(), nota4=getNotaAluno4();

     double soma = (nota1 + nota2 + nota3 + nota4) / 4;
        if (nota1> 10) {

            soma = 0;
            System.out.println("Por isso, terá um valor nulo." + soma);

        }  if (nota2> 10) {

            soma = 0;
            System.out.println("Por isso, terá um valor nulo." + soma);

        } if (nota3> 10) {

            soma = 0;
            System.out.println("Por isso, terá um valor nulo." + soma);

        }if (nota4> 10) {

            soma = 0;
            System.out.println("Por isso, terá um valor nulo." + soma);

        }

     if (soma< 7) {

         return soma;
     }
     return   soma;
 }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public double getNotaAluno() {
        return notaAluno;
    }

    public double getNotaAluno2() {
        return notaAluno2;
    }

    public double getNotaAluno3() {
        return notaAluno3;
    }

    public double getNotaAluno4() {
        return notaAluno4;
    }

    public void setNotaAluno(double notaAluno) {
        this.notaAluno = notaAluno;

        if (notaAluno > 10) {
            System.out.println("A nota "+ notaAluno+ " não é considerada valida. ");
        }
    }

    public void setNotaAluno2(double notaAluno2) {
        this.notaAluno2 = notaAluno2;

        if (notaAluno2 > 10) {
            System.out.println("A nota "+ notaAluno2+ " não é considerada valida. ");
        }
    }

    public void setNotaAluno3(double notaAluno3) {
        this.notaAluno3 = notaAluno3;

        if (notaAluno3 > 10) {
            System.out.println("A nota "+ notaAluno3+ " não é considerada valida. ");
        }
    }

    public void setNotaAluno4(double notaAluno4) {

        if (notaAluno4 > 10) {
            System.out.println("A nota "+ notaAluno4+ " não é considerada valida. ");

        }
        this.notaAluno4 = notaAluno4;

    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String toString() {
        String result = "O aluno" + getMatriculaAluno() + " enontra-se na seguinte situação acadêmica: " +
                calcularMediaAluno(getNotaAluno());

        return result;
    }


}
