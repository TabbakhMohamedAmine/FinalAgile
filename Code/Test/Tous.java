package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Cinema;
import Model.Equipe;
import Model.Film;
import Model.FilmFoot;
import Model.Footballeur;
import Observer.FilmObserv;
import Observer.CinemaObserv;

class Tous { //tests unitaires
    protected Cinema c1;
    protected Film f1;
    protected Film f2;
    protected Film f;
    protected Cinema c;
    protected Footballeur footballeur;
    protected FilmFoot filmFoot;

    @BeforeEach
    public void setUp() {
        c1 = new Cinema("UGC");
        f1 = new Film("How the Grinch stole Christmas", "Ron Howard");
        f2 = new Film("Lock, stock and two smoking barrels", "Guy Ritchie");
        c1.addFilm(f1);
        c1.addFilm(f2);
        f = new Film("Lock, stock and two smoking barrels", "Guy Ritchie");
        c = new Cinema("UGC");
        footballeur = new Footballeur("Amine");
        filmFoot = new FilmFoot(f, footballeur);
    }

    @Test
    public void fixtureTest() {
        assertEquals(2, c1.nbFilms());
        Film film1 = new Film("Roman holiday", "William Wyler");
        c1.addFilm(film1);
        assertEquals(3, c1.nbFilms());
    }

    @Test
    public void setTitreTest() {
        f.setTitre("Shrek");
        assertEquals("Shrek", f.getTitre());
    }

    @Test
    public void setRealTest() {
        f.setRealisateur("Andrew Adamson");
        assertEquals("Andrew Adamson", f.getRealisateur());
    }

    @Test
    public void getTitreTest() {
        assertEquals("Lock, stock and two smoking barrels", f.getTitre());
    }

    @Test
    public void getRealTest() {
        assertEquals("Guy Ritchie", f.getRealisateur());
    }

    @Test
    public void addCinemaTest() {
        assertEquals(f.getListeCinemas().size(), 0);
        c.addFilm(f);
        assertEquals(f.getListeCinemas().size(), 1);
    }

    @Test
    public void testDifference() {
        assertEquals(1, footballeur.difference());
    }

    @Test
    public void testGetgetnombrestrategies() {
        assertEquals(6, footballeur.getNombreStrategies());
    }

    @Test
    public void testGetgetstrategiesutilises() {
        assertEquals(5, footballeur.getStrategiesUtilises());
    }

    @Test
    public void test_add_equipe() {
        Equipe e = new Equipe();
        e.addFootballeur(footballeur);
        assertEquals(1, e.getSize());
    }

    @Test
    public void testverifyDifference() {
        Equipe e = new Equipe();
        Footballeur f1 = new Footballeur("Romain");
        Footballeur f2 = new Footballeur("Amine");
        e.addFootballeur(f1);
        e.addFootballeur(f2);
        assertEquals(2, e.verifyDifference());
    }

    @Test
    public void testJouerFilm() {
        Film film = new Film("The Big Match", "John Director");
        c.addFilm(film);
        Cinema c2 = new Cinema("Dauphine");
        c2.addFilm(film);
        Footballeur footballeurPrincipal = new Footballeur("Amine");
        FilmFoot filmFoot = new FilmFoot(film, footballeurPrincipal);
        assertEquals(filmFoot.getFootballeurPrincipal().getNom(), "Amine");
        assertEquals(filmFoot.getFilm().getTitre(), "The Big Match");
        List<Cinema> testeur = filmFoot.getFilm().getListeCinemas();
        Iterator<Cinema> it = testeur.iterator();
        Cinema c_test1 = it.next();
        assertEquals(c_test1.getNom(), "UGC");
        Cinema c_test2 = it.next();
        assertEquals(c_test2.getNom(), "Dauphine");
    }
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

    @AfterEach
    public void tearDown() {}
}