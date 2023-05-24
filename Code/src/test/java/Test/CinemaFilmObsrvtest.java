package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Equipe;
import Model.Footballeur;
import Observer.CinemaObserv;
import Observer.FilmObserv;

class CinemaFilmObsrvtest {

    public CinemaFilmObsrvtest(){}
    
    @Test
    public void testFilmObserv() {
        FilmObserv film1 = new FilmObserv("The Big Match");
        assertEquals(film1.getTitle(), "The Big Match");
        assertEquals(film1.getConcurrence_films(), 0);
    }
    @Test
    public void CinemaObserv() {
    	CinemaObserv cinema = new CinemaObserv("Cinema1");
        assertEquals(cinema.getNom(), "Cinema1");
        FilmObserv film1 = new FilmObserv("The Big Match");
        cinema.addFilm(film1);
        assertEquals(cinema.nbFilms(), 1);
    }

    @BeforeEach
    public void setUp(){}

    @AfterEach
    public void tearDown(){}

}
