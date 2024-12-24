package MAIN;

public class StaticOSalarioCalc {
    public static void main(String[] args) {


        double valorDoSalario = 100;
        double valorDaHoraTrabalha = 12;

      double result =  CalSalarioStatic.CalcularSalario(valorDoSalario, valorDaHoraTrabalha);


        System.out.println(result);

    }
}
