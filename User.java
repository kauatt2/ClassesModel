package com.kakadumal.entregaclasses.model;

import java.util.List;

public class User {

    private String cpf;
    private String name;
    private String email;
    private List<Review> reviews;



 public User() {}

    public User(String cpf, String name, String email, List<Review> reviews) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.reviews = reviews;
    }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Review> getReviews() { return reviews; }
    public void setReviews(List<Review> reviews) { this.reviews = reviews; }
}

