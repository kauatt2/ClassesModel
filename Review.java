package com.kakadumal.entregaclasses.model;

import java.time.LocalDate;
import java.util.UUID;

public class Review {

    private UUID id;
    private byte rating;
    private String comment;
    private LocalDate date;
    private User user;
    private Movie movie;

    public Review() {}

 public Review(UUID id, byte rating, String comment, LocalDate date, User user, Movie movie) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
        this.user = user;
        this.movie = movie;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public byte getRating() { return rating; }
    public void setRating(byte rating) { this.rating = rating; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }
}

