package com.kakadumal.entregaclasses.model;

import java.util.List;

public class Movie {
    private String IMDB;
    private String title;
    private String description;
    private short releaseYear;
    private String director;
    private short duration;
    private String genre;
    private List<Review> reviews;

    public Movie() {}

    public Movie(String IMDB, String title, String description, short releaseYear, 
                 String director, short duration, String genre, List<Review> reviews) {
        this.IMDB = IMDB;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.director = director;
        this.duration = duration;
        this.genre = genre;
        this.reviews = reviews;
    }

    public String getIMDB() { return IMDB; }
    public void setIMDB(String IMDB) { this.IMDB = IMDB; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public short getReleaseYear() { return releaseYear; }
    public void setReleaseYear(short releaseYear) { this.releaseYear = releaseYear; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public short getDuration() { return duration; }
    public void setDuration(short duration) { this.duration = duration; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public List<Review> getReviews() { return reviews; }
    public void setReviews(List<Review> reviews) { this.reviews = reviews; }
}

