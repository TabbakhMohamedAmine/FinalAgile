package Controller;

import Model.FilmFoot;
import View.FilmFootView;

public class FilmFootController {
    private FilmFoot filmFoot;
    private FilmFootView filmFootView;

    public FilmFootController(FilmFoot filmFoot, FilmFootView filmFootView) {
        this.filmFoot = filmFoot;
        this.filmFootView = filmFootView;
    }
    public void afficherFilm() {
        filmFootView.afficherFilm(filmFoot);
    }
}