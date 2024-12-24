package OOP.ExercisePO;

public class MainAluno {
    private String name;
    private double notaPrimeiroSemestre;
    private double notaSegundoSemestre;
    private double notaTerceiroSemestre;

    MainAluno(String name, double notaPrimeiroSemestre, double notaSegundoSemestre, double notaTerceiroSemestre) {
        this.name = name;
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
        this.notaSegundoSemestre = notaSegundoSemestre;
        this.notaTerceiroSemestre = notaTerceiroSemestre;

    }

    public String getName() {
        return name;
    }

    public double getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public double getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public double getNotaTerceiroSemestre() {
        return notaTerceiroSemestre;
    }

    public double calcularMediaEstudante(double notaTerceiroSemestre, double notaSegundoSemestre, double notaPrimeiroSemestre) {
        double somaPorcentagemNota = getNotaPrimeiroSemestre() + getNotaSegundoSemestre() + getNotaTerceiroSemestre();

        return somaPorcentagemNota;
    }

    public String resultAprovado() {
         double resultEquacao = 60 - calcularMediaEstudante(notaTerceiroSemestre, notaSegundoSemestre, notaPrimeiroSemestre);
        if(calcularMediaEstudante(notaTerceiroSemestre, notaSegundoSemestre, notaPrimeiroSemestre) < 60) {
            return "Falta apenas "+ resultEquacao + " para o aluno "+ getName()+ " ser aprovado.";
        }
            return "O aluno "+ getName() + " está aprovado.";


    }



}
