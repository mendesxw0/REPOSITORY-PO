package src.exercise;

import java.util.Date;

public class Client {


    private String name;
    private String email;
    private Date birthDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client(String name, Date birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }
}
