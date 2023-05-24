package Observer;

import java.util.ArrayList;
import java.util.List;

public class FilmObserv implements Observer {
    private String title;
    private List<CinemaObserv> cinemas;
    private int concurence_films; // concurence dans les cinemas 

    public FilmObserv(String title) {
        this.title = title;
        this.cinemas = new ArrayList<CinemaObserv>();
        concurence_films = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public void addCinema(CinemaObserv cinema) {
        this.cinemas.add(cinema);
    }
    public int getConcurrence_films() {
    	return this.concurence_films;
    }

    @Override
    public void update() {
        concurence_films++;
    }
}
