package AULAS;

public class Fila {
    /*
    Simulador de Fila de Supermercado
    Descrição:
    Desenvolva um programa para simular uma fila no caixa de um supermercado.

    Funcionalidades:
    Adicionar nomes de clientes na fila.
    Remover o primeiro cliente da fila ao ser atendido.
    Exibir a fila completa.
    Desafios extras:

    Exibir quantos clientes ainda estão na fila.
    Implementar a opção de priorizar um cliente específico.

     */

    private String nameCiente;
    private int idadeCliente;
    private int numeroDeCompras;


    public Fila(String nameCiente, int idadeCliente, int numeroDeCompras) {
        this.nameCiente = nameCiente;
        this.idadeCliente = idadeCliente;
        this.numeroDeCompras = numeroDeCompras;
    }

    public String getNameCiente() {
        return nameCiente;
    }

    public void setNameCiente(String nameCiente) {
        this.nameCiente = nameCiente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public int getNumeroDeCompras() {
        return numeroDeCompras;
    }

    public void setNumeroDeCompras(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }

    public boolean atendimentoPreferencial() {
        if (idadeCliente >= 60 || numeroDeCompras <= 5) {
            System.out.println("Atendimento preferencial");
        }
        System.out.println("Continua na fila esperando sua vez. ");
        return false;
    }


    public String toString2() {
        String result = "O cliente " + getNameCiente() +
                " com " + getIdadeCliente() + " anos de idade, " +
                " realizou " + getNumeroDeCompras() + " compras. Pela sua idade e número de compras informado, o cliente " + atendimentoPreferencial();

        return result;
    }

    public String[] removerPrimeiro(Fila[] newFilaTest) {
        if (newFilaTest.length == 0) {
            System.out.println("A fila está vazia!");
            System.out.println(newFilaTest);
        }
        String[] novaFila = new String[newFilaTest.length - 1];
        for (int i = 1; i < newFilaTest.length; i++) {
            novaFila[i - 1] = String.valueOf(newFilaTest[i]);
        }


        return novaFila;
    }



    // Copiando os elementos restantes para o novo array


}

