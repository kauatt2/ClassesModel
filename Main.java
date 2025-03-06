package com.kakadumal.entregaclasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import com.kakadumal.entregaclasses.model.Movie;
import com.kakadumal.entregaclasses.model.Review;
import com.kakadumal.entregaclasses.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("12345678900", "Neymar Jr", "Neyzinho@email.com", new ArrayList<>());
        Movie movie = new Movie("tt1234567", "Matrix", "Ficção científica", (short)1999, "Wachowski", (short)136, "Sci-Fi", new ArrayList<>());
        Review review = new Review(UUID.randomUUID(), (byte)5, "filme top em!", LocalDate.now(), user, movie);
        
        System.out.println("Usuário: " + user.getName());
        System.out.println("Filme: " + movie.getTitle());
        System.out.println("Review: " + review.getComment());
    }
}

