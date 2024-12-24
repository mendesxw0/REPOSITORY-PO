package MAIN;

public class SalarioStatic {
    public static void main(String[] args) {
        CalcularSalarioStatic newStatic = new CalcularSalarioStatic("Lucas", 100.00, 15.50);

        newStatic.getHoraTrabalhada();
        newStatic.getValorHora();
      double result =  newStatic.CalcularSalarioMet(newStatic.getValorHora(), newStatic.getHoraTrabalhada() );
        System.out.println(result);
    }
}
