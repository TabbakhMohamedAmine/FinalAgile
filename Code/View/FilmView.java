package View;

import java.util.List;

import Model.Cinema;
import Model.Film;

public class FilmView {
    public void afficherCinemas(Film f) {
    	List<Cinema> cinemas = f.getListeCinemas();
        System.out.println("Cinémas où le film est diffusé :");
        for (Cinema c : cinemas) {
            System.out.println(c.getNom());
        }
    }
}

