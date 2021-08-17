package ua.com.alevel.entity;

public class TelephoneBookEntity {

    private String id;
    private String name;
    private String telephoneNumber;

    public String toString(){
        return ("Telephone Book ID: " + id + " Name: " + name + " Phone Number: " + telephoneNumber);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
