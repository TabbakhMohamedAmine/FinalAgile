package Model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nom;
    private List<Film> films;

    public Cinema(String nom) {
        this.nom = nom;
        this.films = new ArrayList<>();
    }
    public String getNom() {
    	return this.nom;
    }
    public void addFilm(Film f) {
        this.films.add(f);
        extractedAddCinema(f);
    }

    private void extractedAddCinema(Film f) {
        f.addCinema(this);
    }

    public int nbFilms() {
        return this.films.size();
    }

    public List<Film> getFilms() {
        return this.films;
    }
}
