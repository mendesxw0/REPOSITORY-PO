package src.exercise;

import src.ENUMS.WorkerLevel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalary;

    private Departament departament;
    private List<ContratoPorHora> contrats = new ArrayList<>();

    Worker() {

    }

    public Worker(String name, Double baseSalary, WorkerLevel workerLevel, Departament departament) {

        this.name = name;
        this.baseSalary = baseSalary;
        this.workerLevel = workerLevel;
        this.departament = departament;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContratoPorHora> getContrats() {
        return contrats;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public void addContract(ContratoPorHora contrato) {
        contrats.add(contrato);
    }

    public void removeCOntracts(ContratoPorHora contrato) {

        contrats.remove(contrato);
    }

    public double income(int ano, int mes) {
        Calendar newCalender =  Calendar.getInstance();


        double resultSoma  = baseSalary;
       for (ContratoPorHora c: contrats) {
           newCalender.setTime(c.getDate());

           int c_ano = newCalender.get(Calendar.YEAR) ;
           int c_mes = newCalender.get(Calendar.MONTH);

           if (ano == c_ano && mes == c_mes) {
               resultSoma += c.totalValue();
           }
       }
        return  resultSoma;
    }

}
