package OOP.ExercisePO;

public class MainTriangle {

    private double altura;
    private double largura;


    MainTriangle(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularAreaTriangle() {
        double resultCalcular = (altura * largura) / 2;
        return resultCalcular;
    }

    public double calcualarDiagonal() {
        double resultDiagonal = ((largura * largura) * (altura * altura));
        return resultDiagonal;

    }

    public double cacularPerimetro(double largura, double altura) {
        double perimetro = largura + largura + altura;
        return perimetro;
    }
}
