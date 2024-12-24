package AULAS;

public class ModificadoresDeAcesso01 {
    private String name; // acesso apenas para a mesma classe;

    int idade; // acesso apenas para o mesmo pacote;
    protected double salario; // so pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes.

    public String nameUser; // pode ser acessado por todos os pacotes, exeto por um modulo não inicializado


}
