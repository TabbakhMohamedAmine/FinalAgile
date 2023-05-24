package Observer;

import java.util.ArrayList;
import java.util.List;

public class CinemaObserv implements Subjet {
    private String nom;
    private List<FilmObserv> observers;

    public CinemaObserv(String nom) {
        this.nom = nom;
        this.observers = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public void addFilm(FilmObserv f) {
        attach(f);
        f.addCinema(this);
        notifyObservers(); 
    }
    
    public int nbFilms() {
        return this.observers.size();
    }

    public List<FilmObserv> getFilms() {
        return this.observers;
    }
    @Override
    public void attach(Observer observer) {
        observers.add((FilmObserv) observer);
    }
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}



