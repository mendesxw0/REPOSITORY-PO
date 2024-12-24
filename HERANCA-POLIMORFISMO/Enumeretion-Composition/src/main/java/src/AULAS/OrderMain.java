package src.AULAS;


import src.ENUMS.Client;

import java.util.Date;

public class OrderMain {

    private Integer id;
    private Date moment;
    private Client client;


    public OrderMain() {

    }



    public OrderMain(Integer id, Client client, Date moment) {
        this.id = id;
        this.client = client;
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "OrderMain{" +
                "id=" + id +
                ", moment=" + moment +
                ", client=" + client +
                '}';
    }
}