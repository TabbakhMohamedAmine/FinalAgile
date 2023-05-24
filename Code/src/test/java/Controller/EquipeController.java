package Controller;

import Model.Equipe;
import Model.Footballeur;
import View.EquipeView;

public class EquipeController {
    private Equipe equipe;
    private EquipeView equipeView;

    public EquipeController(Equipe equipe, EquipeView equipeView) {
        this.equipe = equipe;
        this.equipeView = equipeView;
    }

    public void ajouterFootballeur(Footballeur footballeur) {
        equipe.addFootballeur(footballeur);
    }

    public void afficherStatistiquesEquipe() {
        int totalDifference = equipe.verifyDifference();
        int size = equipe.getSize();
        equipeView.afficherStatistiquesEquipe(totalDifference, size);
    }
}

