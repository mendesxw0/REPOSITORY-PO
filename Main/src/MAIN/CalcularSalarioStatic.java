
package MAIN;
public class CalcularSalarioStatic {

private String nameUSer;
private double valorHora;
private double horaTrabalhada;

public String getNameUSer() {
    return nameUSer;
}

public double getValorHora() {
    return valorHora;
}

public double getHoraTrabalhada() {
    return horaTrabalhada;
}


CalcularSalarioStatic(String name, double valorHora, double horaTra) {
    this.horaTrabalhada = horaTra;
    this.valorHora = valorHora;
    this.nameUSer = name;
}

public  double CalcularSalarioMet(double valorDaHora, double horsDoTrabalhador) {
    return valorHora * horaTrabalhada;
}

}
