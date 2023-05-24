package Controller;

import java.util.List;

import Model.Cinema;
import Model.Film;
import View.CinemaView;

public class CinemaController {
    private Cinema cinema;
    private CinemaView cinemaView;

    public CinemaController(Cinema cinema, CinemaView cinemaView) {
        this.cinema = cinema;
        this.cinemaView = cinemaView;
    }

    public void ajouterFilm(Film film) {
        cinema.addFilm(film);
    }

    public void afficherFilms() {
        List<Film> films = cinema.getFilms();
        cinemaView.afficherFilms(films);
    }

    public void afficherNombreFilms() {
        int nbFilms = cinema.nbFilms();
        cinemaView.afficherNombreFilms(nbFilms);
    }
}
