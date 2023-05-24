package View;

import Model.Cinema;
import Model.FilmFoot;

public class FilmFootView {
    public void afficherFilm(FilmFoot filmFoot) {
        System.out.println("Le film " + filmFoot.getFilm().getTitre() + " met en vedette le footballeur " + filmFoot.getFootballeurPrincipal().getNom());
        System.out.println("Le film est diffusé dans les cinémas suivants :");
        for (Cinema cinema : filmFoot.getFilm().getListeCinemas()) {
            System.out.println(cinema.getNom());
        }
    }
}