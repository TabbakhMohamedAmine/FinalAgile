package Controller;

import Model.Film;
import View.FilmView;

public class FilmController {
    private Film film;
    private FilmView filmView;

    public FilmController(Film film, FilmView filmView) {
        this.film = film;
        this.filmView = filmView;
    }

    public void setFilmTitre(String titre) {
        film.setTitre(titre);
    }

    public void setFilmRealisateur(String realisateur) {
        film.setRealisateur(realisateur);
    }
    public void afficherCinemas() {
        filmView.afficherCinemas(film);
    }
}
