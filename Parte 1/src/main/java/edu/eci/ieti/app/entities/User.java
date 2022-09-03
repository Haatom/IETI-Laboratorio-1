package edu.eci.ieti.app.entities;

import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String email;
    private String lastName;


    public User(){
        this.id = UUID.randomUUID().toString();

    }

    public User(String name, String email, String lastName){
        this();
        this.name = name;
        this.email = email;
        this.lastName = lastName;

    }

    public User(String id, String name, String email, String lastName){
        this(name, email, lastName);
        this.id = id;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
