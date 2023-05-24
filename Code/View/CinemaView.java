package View;

import java.util.List;

import Model.Film;

public class CinemaView {
    
	public void afficherFilms(List<Film> films) {
        System.out.println("Films diffusés par le cinéma :");
        for (Film f : films) {
            System.out.println(f.getTitre());
        }
    }

    public void afficherNombreFilms(int nbFilms) {
        System.out.println("Nombre de films diffusés : " + nbFilms);
    }
}
