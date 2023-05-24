package Model;

public class FilmFoot {
    private Film film;
    private Footballeur footballeurPrincipal;

    public FilmFoot(Film film, Footballeur footballeurPrincipal) {
        this.film = film;
        this.footballeurPrincipal = footballeurPrincipal;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Footballeur getFootballeurPrincipal() {
        return footballeurPrincipal;
    }

    public void setFootballeurPrincipal(Footballeur footballeurPrincipal) {
        this.footballeurPrincipal = footballeurPrincipal;
    }

    public void jouerFilm() {
        System.out.println("Le film " + film.getTitre() + " met en vedette le footballeur " + footballeurPrincipal.getNom());
        System.out.println("Le film est diffusé dans les cinémas suivants :");
        for (Cinema cinema : film.getListeCinemas()) {
            System.out.println(cinema.getNom());
        }
    }
}