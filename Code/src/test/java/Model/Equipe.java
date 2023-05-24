package Model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Footballeur> footballeurs;

    public Equipe() {
        this.footballeurs = new ArrayList<>();
    }

    public int verifyDifference() {
        int totalDifference = 0;

        for (Footballeur footballeur : this.footballeurs) {
            totalDifference += footballeur.difference();
        }

        return totalDifference;
    }

    public void addFootballeur(Footballeur footballeur) {
        this.footballeurs.add(footballeur);
        footballeur.addEquipe(this);
    }

    public int getSize() {
        return this.footballeurs.size();
    }
}

