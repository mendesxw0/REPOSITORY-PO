package src.exercise;

import java.util.Date;

public class ContratoPorHora {
    private Date date;
    private  Double valorPorHora;
    private Integer horas;


    ContratoPorHora() {
    }

    public ContratoPorHora(Date date, Integer horas, Double valorPorHora) {
        this.date = date;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double totalValue() {
        return  valorPorHora * horas;
    }
}
