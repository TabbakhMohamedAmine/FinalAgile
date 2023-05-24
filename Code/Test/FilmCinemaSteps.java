package Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import Observer.CinemaObserv;
import Observer.FilmObserv;

public class FilmCinemaSteps {

    private CinemaObserv cinema;
    private FilmObserv film1;
    private FilmObserv film2;

    @Given("Deux films {string} et {string}")
    public void deuxFilms(String titre1, String titre2) {
        this.film1 = new FilmObserv(titre1);
        this.film2 = new FilmObserv(titre2);
    }

    @Given("Un cinéma {string}")
    public void unCinema(String nomCinema) {
        this.cinema = new CinemaObserv(nomCinema);
        cinema.attach(film1);
        film1.addCinema(this.cinema);
    }

    @When("j'ajoute le deuxième film au cinéma")
    public void jAjouteLeFilmAuxCinemas() {
        this.cinema.addFilm(film2);
    }

    @Then("la concurrence du film 1 est mise à jour")
    public void laConcurrenceDuFilmEstMiseAJour() {
        assertEquals(film1.getConcurrence_films(), 1);
    }
}
