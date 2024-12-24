package exercises;

public class Hosting {
    private String nameUserHosting;
    private String emailUserHosting;

    public Hosting(String nameUserHosting, String emailUserHosting) {
        this.nameUserHosting = nameUserHosting;
        this.emailUserHosting = emailUserHosting;
    }

    public String getNameUserHosting() {
        return nameUserHosting;
    }

    public String getEmailUserHosting() {
        return emailUserHosting;
    }

    public void setNameUserHosting(String nameUserHosting) {
        this.nameUserHosting = nameUserHosting;
    }

    public void setEmailUserHosting(String emailUserHosting) {
        this.emailUserHosting = emailUserHosting;
    }

    @Override
    public String toString() {
        return nameUserHosting + " , " + emailUserHosting;
    }
}
