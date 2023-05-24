package Controller;

import Model.Footballeur;
import View.FootballeurView;

public class FootballeurController {
    private Footballeur footballeur;
    private FootballeurView footballeurView;

    public FootballeurController(Footballeur footballeur, FootballeurView footballeurView) {
        this.footballeur = footballeur;
        this.footballeurView = footballeurView;
    }

    public void afficherStatistiques() {
        int nombreStrategies = footballeur.getNombreStrategies();
        int strategiesUtilises = footballeur.getStrategiesUtilises();
        int difference = footballeur.difference();
        footballeurView.afficherStatistiques(nombreStrategies, strategiesUtilises, difference);
    }
}
