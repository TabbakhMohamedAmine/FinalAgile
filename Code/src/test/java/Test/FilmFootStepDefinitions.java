package Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import Model.Cinema;
import Model.Film;
import Model.FilmFoot;
import Model.Footballeur;

public class FilmFootStepDefinitions {
    private Film film;
    private Footballeur footballeurPrincipal;
    private FilmFoot filmFoot;
    private String messageAffiche;

    @Given("un film {string} avec un footballeur principal {string}")
    public void un_film_avec_un_footballeur_principal(String titreFilm, String nomFootballeur) {
        film = new Film(titreFilm,"RealisateurTest");
        footballeurPrincipal = new Footballeur(nomFootballeur);
        filmFoot = new FilmFoot(film, footballeurPrincipal);
        Cinema c1 = new Cinema("A");
        Cinema c2 = new Cinema("B");
        Cinema c3 = new Cinema("C");
        c1.addFilm(film);
        c2.addFilm(film);
        c3.addFilm(film);
    }
  
    
    @When("le film est joué")
    public void le_film_est_joue() {
        filmFoot.jouerFilm();
    }
 
    @Then("le message affiché doit inclure {string} et {string}")
    public void le_message_affiche_doit_inclure_et(String titreFilm, String nomFootballeur) {
        messageAffiche = "Le film " + film.getTitre() + " met en vedette le footballeur " + footballeurPrincipal.getNom();
        assertTrue(messageAffiche.contains(titreFilm));
        assertTrue(messageAffiche.contains(nomFootballeur));
    }

    @Then("les cinémas suivants sont affichés:")
    public void les_cinemas_suivants_sont_affiches(List<String> cinemas) {
        List<String> cinemasAffiches = new ArrayList<>();
        for (Cinema cinema : film.getListeCinemas()) {
            cinemasAffiches.add(cinema.getNom());
        }
        assertEquals(cinemas, cinemasAffiches);
    }
}
