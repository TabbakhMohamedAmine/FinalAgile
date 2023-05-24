package Model;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String titre;
    private String realisateur;
    private List<Cinema> cinemas;

    public Film(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.cinemas = new ArrayList<>();
    }

    public String getTitre() {
        return this.titre;
    }

    public String getRealisateur() {
        return this.realisateur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    protected void addCinema(Cinema c) {
        this.cinemas.add(c);
    }

    public List<Cinema> getListeCinemas() {
        return this.cinemas;
    }
}
